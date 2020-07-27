
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}edgecontrolpoints"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="linewidth" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="linecolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="textcolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontfamily" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontsize" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="fontbold" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fontitalic" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="labelvisible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="labelposition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "edgecontrolpoints"
})
@XmlRootElement(name = "guitransition", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Guitransition {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Edgecontrolpoints edgecontrolpoints;
    @XmlAttribute(name = "refid", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger refid;
    @XmlAttribute(name = "linewidth", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger linewidth;
    @XmlAttribute(name = "linecolor", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String linecolor;
    @XmlAttribute(name = "textcolor", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String textcolor;
    @XmlAttribute(name = "fontfamily", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String fontfamily;
    @XmlAttribute(name = "fontsize", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger fontsize;
    @XmlAttribute(name = "fontbold", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean fontbold;
    @XmlAttribute(name = "fontitalic", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean fontitalic;
    @XmlAttribute(name = "labelvisible", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean labelvisible;
    @XmlAttribute(name = "labelposition", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String labelposition;

    /**
     * Obtient la valeur de la propriété edgecontrolpoints.
     * 
     * @return
     *     possible object is
     *     {@link Edgecontrolpoints }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Edgecontrolpoints getEdgecontrolpoints() {
        return edgecontrolpoints;
    }

    /**
     * Définit la valeur de la propriété edgecontrolpoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Edgecontrolpoints }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEdgecontrolpoints(Edgecontrolpoints value) {
        this.edgecontrolpoints = value;
    }

    /**
     * Obtient la valeur de la propriété refid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getRefid() {
        return refid;
    }

    /**
     * Définit la valeur de la propriété refid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRefid(BigInteger value) {
        this.refid = value;
    }

    /**
     * Obtient la valeur de la propriété linewidth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getLinewidth() {
        return linewidth;
    }

    /**
     * Définit la valeur de la propriété linewidth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLinewidth(BigInteger value) {
        this.linewidth = value;
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
     * Obtient la valeur de la propriété textcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTextcolor() {
        return textcolor;
    }

    /**
     * Définit la valeur de la propriété textcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTextcolor(String value) {
        this.textcolor = value;
    }

    /**
     * Obtient la valeur de la propriété fontfamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFontfamily() {
        return fontfamily;
    }

    /**
     * Définit la valeur de la propriété fontfamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFontfamily(String value) {
        this.fontfamily = value;
    }

    /**
     * Obtient la valeur de la propriété fontsize.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getFontsize() {
        return fontsize;
    }

    /**
     * Définit la valeur de la propriété fontsize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFontsize(BigInteger value) {
        this.fontsize = value;
    }

    /**
     * Obtient la valeur de la propriété fontbold.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isFontbold() {
        return fontbold;
    }

    /**
     * Définit la valeur de la propriété fontbold.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFontbold(boolean value) {
        this.fontbold = value;
    }

    /**
     * Obtient la valeur de la propriété fontitalic.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isFontitalic() {
        return fontitalic;
    }

    /**
     * Définit la valeur de la propriété fontitalic.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFontitalic(boolean value) {
        this.fontitalic = value;
    }

    /**
     * Obtient la valeur de la propriété labelvisible.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isLabelvisible() {
        return labelvisible;
    }

    /**
     * Définit la valeur de la propriété labelvisible.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLabelvisible(boolean value) {
        this.labelvisible = value;
    }

    /**
     * Obtient la valeur de la propriété labelposition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLabelposition() {
        return labelposition;
    }

    /**
     * Définit la valeur de la propriété labelposition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLabelposition(String value) {
        this.labelposition = value;
    }

}
