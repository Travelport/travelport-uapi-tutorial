package com.travelport.tutorial.support;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.common.gzip.GZIPInInterceptor;

/**
 * This is an attempt to create a type-safe wrapper around a "Port" in the sense
 * of the uAPI. Some shenanigans are needed because in practice there is no
 * way to be certain that the generated code (from the WSDL source) actually
 * conforms to the "usual" way that ports are named and how they are retreived
 * from services.  We hide that and immediately exit if anything goes wrong
 * from the expected convention.
 * 
 * @author iansmith
 *
 * @param <P>  Type of the Port
 * @param <S>  Type of the Service
 */
public class PortWrapper<P,S>{
    protected P port;
    protected ServiceWrapper<S> serviceWrapper;
    protected String getterName;
    protected LoggingInInterceptor in = new LoggingInInterceptor();
    protected LoggingOutInterceptor out = new LoggingOutInterceptor();
    protected boolean currentlyShown = false;
    protected String endpoint;
    
    /**
     * Creating a port requires giving a ServiceWrapper and the class object
     * of *this* port type.  
     * @param svc  This is where the service will be retrieved from (via get)
     * @param clazzP This port type's class object is needed so we can it's
     * name in a reasonably type-safe way.
     */
    public PortWrapper(ServiceWrapper<S> svc, Class<P> clazzP, String endpoint) {
        serviceWrapper = svc;
        //System.out.println("getter is: get"+clazzP.getSimpleName());
        String n = clazzP.getSimpleName();
        //THIS IS HORRIBLE
        if (n.equals("SystemTimePortType")) {
            n="SystemtimePortType";
        }
        getterName = "get" + n;
        this.endpoint = endpoint;
        
        if ((!getterName.endsWith("Type")) &&(!getterName.startsWith("getSystem"))) {
            throw new RuntimeException("You supplied a 'port type' that does "
                    +"end in 'type' like alll the others!");
        }
        
        getterName = getterName.substring(0, getterName.length()-4);
    }
    
    /**
     * Returns the port that this class wraps around.
     * 
     * @param endpoint  This should be a constant string that denotes a URL.
     * It varies based on your location in the world.
     * @return  the real port object
     */
    public P get() {
        WSDLService.checkProperties(); //just for safety
        if (port==null) {
            init();
        }
        return port;
    }
    
    /**
     * Add the necessary gunk to the BindingProvider to make it work right
     * with an authenticated SOAP service.  Also turns on the schema 
     * validation which you probably want since this is a tutorial.
     * 
     * @param provider
     *            the provider (usually this a port object also)
     * @param endpoint
     *            the string that is the internet-accessible place to access
     *            the service
     */

    protected void addParametersToProvider(BindingProvider provider,
            String endpoint) {
        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
                endpoint);
        
        String user = System.getProperty("travelport.username");
        if ((user==null) || (user.trim().length()==0)) {
            user = System.getenv(WSDLService.USERNAME_ENV);
        }
        String pwd =System.getProperty("travelport.password");
        if ((pwd==null) || (pwd.trim().length()==0)) {
            pwd = System.getenv(WSDLService.PASSWORD_ENV);
        }
        
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,
                user);
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
                pwd);     
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        //headers.put("Accept-Encoding", Arrays.asList("gzip,deflate"));
        //headers.put("Accept", Arrays.asList("gzip"));
        //headers.put("Transfer-Encoding", Arrays.asList("gzip"));
        provider.getRequestContext().put(Message.PROTOCOL_HEADERS, headers);   
      
        provider.getRequestContext().put("schema-validation-enabled", "false");       
        
        
        /*Map<String, List<String>> rspHeaders = new HashMap<String, List<String>>();
        rspHeaders.put("Content-Encoding", Arrays.asList(URLEncoder.encode("gzip")));
        rspHeaders.put("Transfer-Encoding", Arrays.asList("gzip"));
        //rspHeaders.put("Vary",Arrays.asList(URLEncoder.encode("")));
        provider.getResponseContext().put(Message.PROTOCOL_HEADERS, rspHeaders);*/

    }

    /**
     * Sadly, you must call this method on the wrapper, not on the underlying
     * port because there isn't any easy way to add a method to that object.
     * 
     * @param show true if you want xml output turned on
     * @throws FileNotFoundException 
     */
    public void showXML(boolean show) throws FileNotFoundException {
        if (port==null) {
            init();
        }
        
        File newFile = new File("C:\\LogginInOut.txt");
        PrintWriter printWriter = new PrintWriter(newFile);

        Client cl = ClientProxy.getClient(port);
        if (show) {
            if (!currentlyShown) {
                //System.out.println("ADDED INTERCEPTORS:"+cl.getClass());
            	in = new LoggingInInterceptor(printWriter);
            	out = new LoggingOutInterceptor(printWriter);
            	cl.getInInterceptors().add(new GZIPInInterceptor());
                cl.getInInterceptors().add(in);
                cl.getOutInterceptors().add(out);
                currentlyShown=true;
            }       
        } else {
            if (currentlyShown) {
            	cl.getInInterceptors().remove(new GZIPInInterceptor());
                cl.getInInterceptors().remove(in);
                cl.getOutInterceptors().remove(out);
                currentlyShown=false;
            }
        }
    }
     
    /**
     * This is the place where we actually generate an instance of the port type
     * by accessing the service and (reflectively) calling the getter.  The
     * name of the getter is derived from convention, not the type sysetm itself.
     * 
     * This method is not strictly type-safe because it requires an unchecked
     * conversion from the return value of the getter.  If that getter returns
     * the capital of north dakota, bad things happen.
     */
    @SuppressWarnings("unchecked")
    protected void init() {
        try {
            Object service = serviceWrapper.get();

            //System.out.print("service object is of type:"+service.getClass().getSimpleName());
            //System.out.println(",getter is:"+getterName);
            Method getter = service.getClass().getMethod(getterName, (Class<Object>[]) null);
            Object result = getter.invoke(service);
            
            port = (P)result;
            addParametersToProvider((BindingProvider) port, endpoint);
            
            in.setPrettyLogging(true);
            out.setPrettyLogging(true);

        } catch (SecurityException e) {
            throw new RuntimeException("You supplied a bad service/*port* pair:"+
                    e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("You supplied a bad service/*port* pair:"+
                    e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("You supplied a bad service/*port* pair:"+
                    e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException("You supplied a bad service/*port* pair:"+
                    e.getMessage());
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        }
    }
    
}
