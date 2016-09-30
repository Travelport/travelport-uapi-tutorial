
package com.travelport.schema.passive_v38_0;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.travelport.schema.passive_v38_0 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.travelport.schema.passive_v38_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PassiveSegment }
     * 
     */
    public PassiveSegment createPassiveSegment() {
        return new PassiveSegment();
    }

    /**
     * Create an instance of {@link PassiveReservation }
     * 
     */
    public PassiveReservation createPassiveReservation() {
        return new PassiveReservation();
    }

    /**
     * Create an instance of {@link PassiveSegment.Amount }
     * 
     */
    public PassiveSegment.Amount createPassiveSegmentAmount() {
        return new PassiveSegment.Amount();
    }

    /**
     * Create an instance of {@link PassiveRemark }
     * 
     */
    public PassiveRemark createPassiveRemark() {
        return new PassiveRemark();
    }

    /**
     * Create an instance of {@link AssociatedRemark }
     * 
     */
    public AssociatedRemark createAssociatedRemark() {
        return new AssociatedRemark();
    }

    /**
     * Create an instance of {@link PassiveSegmentRef }
     * 
     */
    public PassiveSegmentRef createPassiveSegmentRef() {
        return new PassiveSegmentRef();
    }

}
