
package be.unamur.metamodel;

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
 *       &lt;attribute name="rule" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "iar", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Iar {

    @XmlAttribute(name = "rule", required = true)
    protected String rule;
    @XmlAttribute(name = "allowed", required = true)
    protected boolean allowed;

    /**
     * Obtient la valeur de la propriété rule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Définit la valeur de la propriété rule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
    }

    /**
     * Obtient la valeur de la propriété allowed.
     * 
     */
    public boolean isAllowed() {
        return allowed;
    }

    /**
     * Définit la valeur de la propriété allowed.
     * 
     */
    public void setAllowed(boolean value) {
        this.allowed = value;
    }

}
