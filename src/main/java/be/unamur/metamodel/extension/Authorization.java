
package be.unamur.metamodel.extension;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="eventId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="participantTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Authorization")
public class Authorization {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "eventId", required = true)
    protected BigInteger eventId;
    @XmlAttribute(name = "participantTypeId", required = true)
    protected BigInteger participantTypeId;
    @XmlAttribute(name = "allowed")
    protected Boolean allowed;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété eventId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventId() {
        return eventId;
    }

    /**
     * Définit la valeur de la propriété eventId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventId(BigInteger value) {
        this.eventId = value;
    }

    /**
     * Obtient la valeur de la propriété participantTypeId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParticipantTypeId() {
        return participantTypeId;
    }

    /**
     * Définit la valeur de la propriété participantTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParticipantTypeId(BigInteger value) {
        this.participantTypeId = value;
    }

    /**
     * Obtient la valeur de la propriété allowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowed() {
        if (allowed == null) {
            return true;
        } else {
            return allowed;
        }
    }

    /**
     * Définit la valeur de la propriété allowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowed(Boolean value) {
        this.allowed = value;
    }

}
