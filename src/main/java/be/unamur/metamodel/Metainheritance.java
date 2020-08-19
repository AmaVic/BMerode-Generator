
package be.unamur.metamodel;

import java.math.BigInteger;
import javax.annotation.Generated;
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
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="supertypeid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="subtypeid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "metainheritance")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Metainheritance {

    @XmlAttribute(name = "id", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger id;
    @XmlAttribute(name = "supertypeid", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger supertypeid;
    @XmlAttribute(name = "subtypeid", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger subtypeid;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété supertypeid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getSupertypeid() {
        return supertypeid;
    }

    /**
     * Définit la valeur de la propriété supertypeid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSupertypeid(BigInteger value) {
        this.supertypeid = value;
    }

    /**
     * Obtient la valeur de la propriété subtypeid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getSubtypeid() {
        return subtypeid;
    }

    /**
     * Définit la valeur de la propriété subtypeid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSubtypeid(BigInteger value) {
        this.subtypeid = value;
    }

}
