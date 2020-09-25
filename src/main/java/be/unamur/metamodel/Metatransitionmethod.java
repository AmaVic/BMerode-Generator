
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
 *       &lt;attribute name="methodid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="safeid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="methodname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "metatransitionmethod", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Metatransitionmethod {

    @XmlAttribute(name = "methodid", required = true)
    protected BigInteger methodid;
    @XmlAttribute(name = "safeid")
    protected BigInteger safeid;
    @XmlAttribute(name = "methodname")
    protected String methodname;

    /**
     * Obtient la valeur de la propriété methodid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMethodid() {
        return methodid;
    }

    /**
     * Définit la valeur de la propriété methodid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMethodid(BigInteger value) {
        this.methodid = value;
    }

    /**
     * Obtient la valeur de la propriété safeid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSafeid() {
        return safeid;
    }

    /**
     * Définit la valeur de la propriété safeid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSafeid(BigInteger value) {
        this.safeid = value;
    }

    /**
     * Obtient la valeur de la propriété methodname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodname() {
        return methodname;
    }

    /**
     * Définit la valeur de la propriété methodname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodname(String value) {
        this.methodname = value;
    }

}
