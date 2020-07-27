
package be.unamur.metamodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metadescription"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaconstraints"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metamultiplepropagationconstraints" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaattributes"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metafsms"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abstract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadescription",
    "metaconstraints",
    "metamultiplepropagationconstraints",
    "metaattributes",
    "metafsms"
})
@XmlRootElement(name = "metaobject", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Metaobject {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String metadescription;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String metaconstraints;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Metamultiplepropagationconstraints> metamultiplepropagationconstraints;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metaattributes metaattributes;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metafsms metafsms;
    @XmlAttribute(name = "id", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlAttribute(name = "abstract", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean _abstract;

    /**
     * Obtient la valeur de la propriété metadescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMetadescription() {
        return metadescription;
    }

    /**
     * Définit la valeur de la propriété metadescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetadescription(String value) {
        this.metadescription = value;
    }

    /**
     * Obtient la valeur de la propriété metaconstraints.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMetaconstraints() {
        return metaconstraints;
    }

    /**
     * Définit la valeur de la propriété metaconstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetaconstraints(String value) {
        this.metaconstraints = value;
    }

    /**
     * Gets the value of the metamultiplepropagationconstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metamultiplepropagationconstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetamultiplepropagationconstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metamultiplepropagationconstraints }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Metamultiplepropagationconstraints> getMetamultiplepropagationconstraints() {
        if (metamultiplepropagationconstraints == null) {
            metamultiplepropagationconstraints = new ArrayList<Metamultiplepropagationconstraints>();
        }
        return this.metamultiplepropagationconstraints;
    }

    /**
     * Obtient la valeur de la propriété metaattributes.
     * 
     * @return
     *     possible object is
     *     {@link Metaattributes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metaattributes getMetaattributes() {
        return metaattributes;
    }

    /**
     * Définit la valeur de la propriété metaattributes.
     * 
     * @param value
     *     allowed object is
     *     {@link Metaattributes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetaattributes(Metaattributes value) {
        this.metaattributes = value;
    }

    /**
     * Obtient la valeur de la propriété metafsms.
     * 
     * @return
     *     possible object is
     *     {@link Metafsms }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metafsms getMetafsms() {
        return metafsms;
    }

    /**
     * Définit la valeur de la propriété metafsms.
     * 
     * @param value
     *     allowed object is
     *     {@link Metafsms }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetafsms(Metafsms value) {
        this.metafsms = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété abstract.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isAbstract() {
        return _abstract;
    }

    /**
     * Définit la valeur de la propriété abstract.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAbstract(boolean value) {
        this._abstract = value;
    }

}
