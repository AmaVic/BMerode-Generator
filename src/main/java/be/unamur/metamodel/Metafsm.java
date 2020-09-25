
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
@XmlRootElement(name = "metafsm", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Metafsm implements Identifiable {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metastates metastates;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metatransitions metatransitions;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "codegeneration", required = true)
    protected boolean codegeneration;

    /**
     * Obtient la valeur de la propriété metastates.
     * 
     * @return
     *     possible object is
     *     {@link Metastates }
     *     
     */
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
     * Obtient la valeur de la propriété codegeneration.
     * 
     */
    public boolean isCodegeneration() {
        return codegeneration;
    }

    /**
     * Définit la valeur de la propriété codegeneration.
     * 
     */
    public void setCodegeneration(boolean value) {
        this.codegeneration = value;
    }

}
