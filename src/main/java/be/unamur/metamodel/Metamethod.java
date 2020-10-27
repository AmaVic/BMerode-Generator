
package be.unamur.metamodel;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaprecondition"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaimplementation"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metapostcondition"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaattributes"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provenance" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ownerobjectid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ownereventid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="viamethod" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="viadependency" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="viainheritance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metaprecondition",
    "metaimplementation",
    "metapostcondition",
    "metaattributes"
})
@XmlRootElement(name = "metamethod", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Metamethod implements Identifiable {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected String metaprecondition;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected String metaimplementation;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected String metapostcondition;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metaattributes metaattributes;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "provenance", required = true)
    protected String provenance;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "ownerobjectid", required = true)
    protected BigInteger ownerobjectid;
    @XmlAttribute(name = "ownereventid", required = true)
    protected BigInteger ownereventid;
    @XmlAttribute(name = "viamethod")
    protected BigInteger viamethod;
    @XmlAttribute(name = "viadependency")
    protected BigInteger viadependency;
    @XmlAttribute(name = "viainheritance")
    protected BigInteger viainheritance;

    /**
     * Obtient la valeur de la propriété metaprecondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaprecondition() {
        return metaprecondition;
    }

    /**
     * Définit la valeur de la propriété metaprecondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaprecondition(String value) {
        this.metaprecondition = value;
    }

    /**
     * Obtient la valeur de la propriété metaimplementation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaimplementation() {
        return metaimplementation;
    }

    /**
     * Définit la valeur de la propriété metaimplementation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaimplementation(String value) {
        this.metaimplementation = value;
    }

    /**
     * Obtient la valeur de la propriété metapostcondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetapostcondition() {
        return metapostcondition;
    }

    /**
     * Définit la valeur de la propriété metapostcondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetapostcondition(String value) {
        this.metapostcondition = value;
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
     * Obtient la valeur de la propriété provenance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvenance() {
        return provenance;
    }

    /**
     * Définit la valeur de la propriété provenance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvenance(String value) {
        this.provenance = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setType(String value) {
        this.type = value;
    }

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
     * Obtient la valeur de la propriété viamethod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViamethod() {
        return viamethod;
    }

    /**
     * Définit la valeur de la propriété viamethod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViamethod(BigInteger value) {
        this.viamethod = value;
    }

    /**
     * Obtient la valeur de la propriété viadependency.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViadependency() {
        return viadependency;
    }

    /**
     * Définit la valeur de la propriété viadependency.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViadependency(BigInteger value) {
        this.viadependency = value;
    }

    /**
     * Obtient la valeur de la propriété viainheritance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViainheritance() {
        return viainheritance;
    }

    /**
     * Définit la valeur de la propriété viainheritance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViainheritance(BigInteger value) {
        this.viainheritance = value;
    }

}
