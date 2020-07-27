
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}oetobjects"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}oetevents"/>
 *       &lt;/sequence>
 *       &lt;attribute name="highlightercolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="linecolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backgroundcolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hidedisabledmethods" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="headerrotation" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="scale" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oetobjects",
    "oetevents"
})
@XmlRootElement(name = "oetview", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Oetview {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Oetobjects oetobjects;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Oetevents oetevents;
    @XmlAttribute(name = "highlightercolor", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String highlightercolor;
    @XmlAttribute(name = "linecolor", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String linecolor;
    @XmlAttribute(name = "backgroundcolor", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String backgroundcolor;
    @XmlAttribute(name = "hidedisabledmethods", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean hidedisabledmethods;
    @XmlAttribute(name = "headerrotation", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger headerrotation;
    @XmlAttribute(name = "scale", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected double scale;

    /**
     * Obtient la valeur de la propriété oetobjects.
     * 
     * @return
     *     possible object is
     *     {@link Oetobjects }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Oetobjects getOetobjects() {
        return oetobjects;
    }

    /**
     * Définit la valeur de la propriété oetobjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Oetobjects }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOetobjects(Oetobjects value) {
        this.oetobjects = value;
    }

    /**
     * Obtient la valeur de la propriété oetevents.
     * 
     * @return
     *     possible object is
     *     {@link Oetevents }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Oetevents getOetevents() {
        return oetevents;
    }

    /**
     * Définit la valeur de la propriété oetevents.
     * 
     * @param value
     *     allowed object is
     *     {@link Oetevents }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOetevents(Oetevents value) {
        this.oetevents = value;
    }

    /**
     * Obtient la valeur de la propriété highlightercolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getHighlightercolor() {
        return highlightercolor;
    }

    /**
     * Définit la valeur de la propriété highlightercolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHighlightercolor(String value) {
        this.highlightercolor = value;
    }

    /**
     * Obtient la valeur de la propriété linecolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLinecolor() {
        return linecolor;
    }

    /**
     * Définit la valeur de la propriété linecolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLinecolor(String value) {
        this.linecolor = value;
    }

    /**
     * Obtient la valeur de la propriété backgroundcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getBackgroundcolor() {
        return backgroundcolor;
    }

    /**
     * Définit la valeur de la propriété backgroundcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBackgroundcolor(String value) {
        this.backgroundcolor = value;
    }

    /**
     * Obtient la valeur de la propriété hidedisabledmethods.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isHidedisabledmethods() {
        return hidedisabledmethods;
    }

    /**
     * Définit la valeur de la propriété hidedisabledmethods.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHidedisabledmethods(boolean value) {
        this.hidedisabledmethods = value;
    }

    /**
     * Obtient la valeur de la propriété headerrotation.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getHeaderrotation() {
        return headerrotation;
    }

    /**
     * Définit la valeur de la propriété headerrotation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHeaderrotation(BigInteger value) {
        this.headerrotation = value;
    }

    /**
     * Obtient la valeur de la propriété scale.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public double getScale() {
        return scale;
    }

    /**
     * Définit la valeur de la propriété scale.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setScale(double value) {
        this.scale = value;
    }

}
