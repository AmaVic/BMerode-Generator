
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metapath" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="metaMPCkind" type="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaMPCkind"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="EQUAL_TO" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metapath",
    "metaMPCkind"
})
@XmlRootElement(name = "metamultiplepropagationconstraint")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Metamultiplepropagationconstraint implements Identifiable {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Metapath> metapath;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected MetaMPCkind metaMPCkind;
    @XmlAttribute(name = "id", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger id;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;

    /**
     * Gets the value of the metapath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metapath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetapath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metapath }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Metapath> getMetapath() {
        if (metapath == null) {
            metapath = new ArrayList<Metapath>();
        }
        return this.metapath;
    }

    /**
     * Obtient la valeur de la propriété metaMPCkind.
     * 
     * @return
     *     possible object is
     *     {@link MetaMPCkind }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public MetaMPCkind getMetaMPCkind() {
        return metaMPCkind;
    }

    /**
     * Définit la valeur de la propriété metaMPCkind.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaMPCkind }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetaMPCkind(MetaMPCkind value) {
        this.metaMPCkind = value;
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
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getType() {
        if (type == null) {
            return "EQUAL_TO";
        } else {
            return type;
        }
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

}
