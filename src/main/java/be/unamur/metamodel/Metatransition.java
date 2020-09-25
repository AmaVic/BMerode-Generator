
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metatransitionmethods"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="legacy_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourcestateid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="targetstateid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metatransitionmethods"
})
@XmlRootElement(name = "metatransition", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Metatransition implements Identifiable {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metatransitionmethods metatransitionmethods;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "legacy_name")
    protected String legacyName;
    @XmlAttribute(name = "sourcestateid", required = true)
    protected BigInteger sourcestateid;
    @XmlAttribute(name = "targetstateid", required = true)
    protected BigInteger targetstateid;

    /**
     * Obtient la valeur de la propriété metatransitionmethods.
     * 
     * @return
     *     possible object is
     *     {@link Metatransitionmethods }
     *     
     */
    public Metatransitionmethods getMetatransitionmethods() {
        return metatransitionmethods;
    }

    /**
     * Définit la valeur de la propriété metatransitionmethods.
     * 
     * @param value
     *     allowed object is
     *     {@link Metatransitionmethods }
     *     
     */
    public void setMetatransitionmethods(Metatransitionmethods value) {
        this.metatransitionmethods = value;
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
     * Obtient la valeur de la propriété legacyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyName() {
        return legacyName;
    }

    /**
     * Définit la valeur de la propriété legacyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyName(String value) {
        this.legacyName = value;
    }

    /**
     * Obtient la valeur de la propriété sourcestateid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourcestateid() {
        return sourcestateid;
    }

    /**
     * Définit la valeur de la propriété sourcestateid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourcestateid(BigInteger value) {
        this.sourcestateid = value;
    }

    /**
     * Obtient la valeur de la propriété targetstateid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetstateid() {
        return targetstateid;
    }

    /**
     * Définit la valeur de la propriété targetstateid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetstateid(BigInteger value) {
        this.targetstateid = value;
    }

}
