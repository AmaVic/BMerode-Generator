
package be.unamur.metamodel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="ownerobjectid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ownereventid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "permission", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Permission {

    @XmlAttribute(name = "ownerobjectid", required = true)
    protected BigInteger ownerobjectid;
    @XmlAttribute(name = "ownereventid", required = true)
    protected BigInteger ownereventid;
    @XmlAttribute(name = "allowed")
    protected Boolean allowed;

    /**
     * Obtient la valeur de la propriété ownerobjectid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnerobjectid() {
        return ownerobjectid;
    }

    /**
     * Définit la valeur de la propriété ownerobjectid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnerobjectid(BigInteger value) {
        this.ownerobjectid = value;
    }

    /**
     * Obtient la valeur de la propriété ownereventid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnereventid() {
        return ownereventid;
    }

    /**
     * Définit la valeur de la propriété ownereventid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnereventid(BigInteger value) {
        this.ownereventid = value;
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
            return false;
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
