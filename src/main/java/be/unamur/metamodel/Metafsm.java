
package be.unamur.metamodel;

import java.math.BigInteger;
import javax.annotation.Generated;
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metastates"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metatransitions"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codegeneration" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metastates",
    "metatransitions"
})
@XmlRootElement(name = "metafsm")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Metafsm implements Identifiable {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metastates metastates;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metatransitions metatransitions;
    @XmlAttribute(name = "id", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlAttribute(name = "type", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;
    @XmlAttribute(name = "codegeneration", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean codegeneration;

    /**
     * Obtient la valeur de la propriété metastates.
     * 
     * @return
     *     possible object is
     *     {@link Metastates }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metastates getMetastates() {
        return metastates;
    }

    /**
     * Définit la valeur de la propriété metastates.
     * 
     * @param value
     *     allowed object is
     *     {@link Metastates }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetastates(Metastates value) {
        this.metastates = value;
    }

    /**
     * Obtient la valeur de la propriété metatransitions.
     * 
     * @return
     *     possible object is
     *     {@link Metatransitions }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metatransitions getMetatransitions() {
        return metatransitions;
    }

    /**
     * Définit la valeur de la propriété metatransitions.
     * 
     * @param value
     *     allowed object is
     *     {@link Metatransitions }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetatransitions(Metatransitions value) {
        this.metatransitions = value;
    }

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
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété codegeneration.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isCodegeneration() {
        return codegeneration;
    }

    /**
     * Définit la valeur de la propriété codegeneration.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodegeneration(boolean value) {
        this.codegeneration = value;
    }

}
