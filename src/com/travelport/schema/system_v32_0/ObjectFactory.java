
package com.travelport.schema.system_v32_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.travelport.schema.system_v32_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Payload_QNAME = new QName("http://www.travelport.com/schema/system_v32_0", "Payload");
    private final static QName _SystemTime_QNAME = new QName("http://www.travelport.com/schema/system_v32_0", "SystemTime");
    private final static QName _UserId_QNAME = new QName("http://www.travelport.com/schema/system_v32_0", "UserId");
    private final static QName _Password_QNAME = new QName("http://www.travelport.com/schema/system_v32_0", "Password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.travelport.schema.system_v32_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExternalCacheAccessReq }
     * 
     */
    public ExternalCacheAccessReq createExternalCacheAccessReq() {
        return new ExternalCacheAccessReq();
    }

    /**
     * Create an instance of {@link ExternalCacheAccessRsp }
     * 
     */
    public ExternalCacheAccessRsp createExternalCacheAccessRsp() {
        return new ExternalCacheAccessRsp();
    }

    /**
     * Create an instance of {@link PingReq }
     * 
     */
    public PingReq createPingReq() {
        return new PingReq();
    }

    /**
     * Create an instance of {@link PingRsp }
     * 
     */
    public PingRsp createPingRsp() {
        return new PingRsp();
    }

    /**
     * Create an instance of {@link SystemInfoReq }
     * 
     */
    public SystemInfoReq createSystemInfoReq() {
        return new SystemInfoReq();
    }

    /**
     * Create an instance of {@link SystemInfoRsp }
     * 
     */
    public SystemInfoRsp createSystemInfoRsp() {
        return new SystemInfoRsp();
    }

    /**
     * Create an instance of {@link SystemInfo }
     * 
     */
    public SystemInfo createSystemInfo() {
        return new SystemInfo();
    }

    /**
     * Create an instance of {@link TimeReq }
     * 
     */
    public TimeReq createTimeReq() {
        return new TimeReq();
    }

    /**
     * Create an instance of {@link TimeRsp }
     * 
     */
    public TimeRsp createTimeRsp() {
        return new TimeRsp();
    }

    /**
     * Create an instance of {@link BridgedBranch }
     * 
     */
    public BridgedBranch createBridgedBranch() {
        return new BridgedBranch();
    }

    /**
     * Create an instance of {@link ExternalCacheAccessReq.RetrieveEntry }
     * 
     */
    public ExternalCacheAccessReq.RetrieveEntry createExternalCacheAccessReqRetrieveEntry() {
        return new ExternalCacheAccessReq.RetrieveEntry();
    }

    /**
     * Create an instance of {@link ExternalCacheAccessReq.DeleteEntry }
     * 
     */
    public ExternalCacheAccessReq.DeleteEntry createExternalCacheAccessReqDeleteEntry() {
        return new ExternalCacheAccessReq.DeleteEntry();
    }

    /**
     * Create an instance of {@link ExternalCacheAccessRsp.CacheEntry }
     * 
     */
    public ExternalCacheAccessRsp.CacheEntry createExternalCacheAccessRspCacheEntry() {
        return new ExternalCacheAccessRsp.CacheEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/system_v32_0", name = "Payload")
    public JAXBElement<String> createPayload(String value) {
        return new JAXBElement<String>(_Payload_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/system_v32_0", name = "SystemTime")
    public JAXBElement<String> createSystemTime(String value) {
        return new JAXBElement<String>(_SystemTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/system_v32_0", name = "UserId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/system_v32_0", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

}
