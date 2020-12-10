
package be.unamur.metamodel.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ParticipantTypes"/>
 *         &lt;element ref="{}EPT"/>
 *         &lt;element ref="{}IARS"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "participantTypes",
    "ept",
    "iars"
})
@XmlRootElement(name = "MerodeExtension")
public class MerodeExtension {

    @XmlElement(name = "ParticipantTypes", required = true)
    protected ParticipantTypes participantTypes;
    @XmlElement(name = "EPT", required = true)
    protected EPT ept;
    @XmlElement(name = "IARS", required = true)
    protected IARS iars;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "version")
    protected Float version;

    /**
     * Obtient la valeur de la propriété participantTypes.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantTypes }
     *     
     */
    public ParticipantTypes getParticipantTypes() {
        return participantTypes;
    }

    /**
     * Définit la valeur de la propriété participantTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantTypes }
     *     
     */
    public void setParticipantTypes(ParticipantTypes value) {
        this.participantTypes = value;
    }

    /**
     * Obtient la valeur de la propriété ept.
     * 
     * @return
     *     possible object is
     *     {@link EPT }
     *     
     */
    public EPT getEPT() {
        return ept;
    }

    /**
     * Définit la valeur de la propriété ept.
     * 
     * @param value
     *     allowed object is
     *     {@link EPT }
     *     
     */
    public void setEPT(EPT value) {
        this.ept = value;
    }

    /**
     * Obtient la valeur de la propriété iars.
     * 
     * @return
     *     possible object is
     *     {@link IARS }
     *     
     */
    public IARS getIARS() {
        return iars;
    }

    /**
     * Définit la valeur de la propriété iars.
     * 
     * @param value
     *     allowed object is
     *     {@link IARS }
     *     
     */
    public void setIARS(IARS value) {
        this.iars = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersion(Float value) {
        this.version = value;
    }

}
