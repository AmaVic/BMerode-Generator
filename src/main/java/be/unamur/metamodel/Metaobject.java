
package be.unamur.metamodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *       &lt;attribute name="isParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
public class Metaobject implements Identifiable {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected String metadescription;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected String metaconstraints;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    protected List<Metamultiplepropagationconstraints> metamultiplepropagationconstraints;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metaattributes metaattributes;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metafsms metafsms;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "abstract", required = true)
    protected boolean _abstract;

    /**
     * Obtient la valeur de la propriété metadescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Obtient la valeur de la propriété abstract.
     * 
     */
    public boolean isAbstract() {
        return _abstract;
    }

    /**
     * Définit la valeur de la propriété abstract.
     * 
     */
    public void setAbstract(boolean value) {
        this._abstract = value;
    }
}
