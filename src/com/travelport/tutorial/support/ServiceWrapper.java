package com.travelport.tutorial.support;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;


/**
 * This is a type-safe wrapper around a "Service" in the sense
 * of the uAPI. 
 * 
 * @author iansmith
 *
 * @param <S>  Type of the Service
 */

public class ServiceWrapper<S> {
    protected S service;
    protected Class<S> clazzS;
    protected String wsdl;
    
    /**
     * You must supply the class of the object a second time, sadly.
     * 
     * @param wsdlPath path to the WSDL that represents the service 
     * @param clazzS an extra copy of the class, because we need to use the
     * run-time type to call a constructor (and this cannot be derived
     * from the type declaration in java)
     */
    public ServiceWrapper(String wsdlPath,Class<S> clazzS) {
        this.clazzS = clazzS;
        this.wsdl = wsdlPath;
        init();
    }
    
    /**
     * Get the service this object wraps around.
     * 
     * @return the underlying service object.  it is created if not yet
     * instantiated
     */
    public S get() {
        if (service==null) {
            init();
        }
        return service;
    }
    
    /**
     * This method does the work of creating an instance of the class given
     * the URL of the wsdl provided in the constructor.  This is actually
     * type-safe, so the fact that "abort" if anything goes wrong should
     * never happen.
     */
    protected void init() {
        try {
            URL url = WSDLService.getURLForWSDL(wsdl);
            Constructor<S> constructor = clazzS.getConstructor(URL.class);
            service = constructor.newInstance(url);

        } catch (SecurityException e) {
            throw new RuntimeException("You supplied a bad *service*/port pair (Security):"+
                    e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("You supplied a bad *service*/port pair (NoSuchMethod):"+
                    e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("You supplied a bad *service*/port pair (IllegalArgument):"+
                    e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException("You supplied a bad *service*/port pair (IllegalAccess):"+
                    e.getMessage());
        } catch (InvocationTargetException e) {
            throw new RuntimeException("You supplied a bad *service*/port pair (InvocationTarget):"+
                    e.getMessage());
        } catch (InstantiationException e) {
            throw new RuntimeException("You supplied a bad *service*/port pair (Instantiation):"+
                    e.getMessage());
        }
        
    }
    

}


