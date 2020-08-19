
package be.unamur.metamodel;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metamodel"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guimodel"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mxp.version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="jmermaid.version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metamodel",
    "guimodel"
})
@XmlRootElement(name = "mermaidmodel")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Mermaidmodel {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metamodel metamodel;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Guimodel guimodel;
    @XmlAttribute(name = "mxp.version", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal mxpVersion;
    @XmlAttribute(name = "jmermaid.version", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal jmermaidVersion;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "anySimpleType")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String timestamp;

    /**
     * Obtient la valeur de la propriété metamodel.
     * 
     * @return
     *     possible object is
     *     {@link Metamodel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metamodel getMetamodel() {
        return metamodel;
    }

    /**
     * Définit la valeur de la propriété metamodel.
     * 
     * @param value
     *     allowed object is
     *     {@link Metamodel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetamodel(Metamodel value) {
        this.metamodel = value;
    }

    /**
     * Obtient la valeur de la propriété guimodel.
     * 
     * @return
     *     possible object is
     *     {@link Guimodel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Guimodel getGuimodel() {
        return guimodel;
    }

    /**
     * Définit la valeur de la propriété guimodel.
     * 
     * @param value
     *     allowed object is
     *     {@link Guimodel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGuimodel(Guimodel value) {
        this.guimodel = value;
    }

    /**
     * Obtient la valeur de la propriété mxpVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getMxpVersion() {
        return mxpVersion;
    }

    /**
     * Définit la valeur de la propriété mxpVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMxpVersion(BigDecimal value) {
        this.mxpVersion = value;
    }

    /**
     * Obtient la valeur de la propriété jmermaidVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getJmermaidVersion() {
        return jmermaidVersion;
    }

    /**
     * Définit la valeur de la propriété jmermaidVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setJmermaidVersion(BigDecimal value) {
        this.jmermaidVersion = value;
    }

    /**
     * Obtient la valeur de la propriété timestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Définit la valeur de la propriété timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

}
