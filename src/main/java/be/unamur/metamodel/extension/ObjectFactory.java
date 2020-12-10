
package be.unamur.metamodel.extension;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.unamur.metamodel.extension package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.unamur.metamodel.extension
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link MerodeExtension }
     * 
     */
    public MerodeExtension createMerodeExtension() {
        return new MerodeExtension();
    }

    /**
     * Create an instance of {@link ParticipantTypes }
     * 
     */
    public ParticipantTypes createParticipantTypes() {
        return new ParticipantTypes();
    }

    /**
     * Create an instance of {@link ParticipantType }
     * 
     */
    public ParticipantType createParticipantType() {
        return new ParticipantType();
    }

    /**
     * Create an instance of {@link EPT }
     * 
     */
    public EPT createEPT() {
        return new EPT();
    }

    /**
     * Create an instance of {@link IARS }
     * 
     */
    public IARS createIARS() {
        return new IARS();
    }

    /**
     * Create an instance of {@link IAR }
     * 
     */
    public IAR createIAR() {
        return new IAR();
    }

}
