
package be.unamur.metamodel.extension;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="transitionId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="methodId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rule" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "IAR")
public class IAR {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "transitionId", required = true)
    protected BigInteger transitionId;
    @XmlAttribute(name = "methodId", required = true)
    protected BigInteger methodId;
    @XmlAttribute(name = "rule", required = true)
    protected String rule;
    @XmlAttribute(name = "allowed")
    protected Boolean allowed;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété transitionId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransitionId() {
        return transitionId;
    }

    /**
     * Définit la valeur de la propriété transitionId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransitionId(BigInteger value) {
        this.transitionId = value;
    }

    /**
     * Obtient la valeur de la propriété methodId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMethodId() {
        return methodId;
    }

    /**
     * Définit la valeur de la propriété methodId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMethodId(BigInteger value) {
        this.methodId = value;
    }

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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowed() {
        if (allowed == null) {
            return true;
        } else {
            return allowed;
        }
    }

    /**
     * Définit la valeur de la propriété allowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowed(Boolean value) {
        this.allowed = value;
    }

}
