
package be.unamur.metamodel;

import java.math.BigInteger;
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
 *       &lt;attribute name="refid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="location" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="borderthickness" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="bordercolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backgroundcolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gradientcolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="textcolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontfamily" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontsize" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="fontbold" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fontitalic" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "guistate", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Guistate {

    @XmlAttribute(name = "refid", required = true)
    protected BigInteger refid;
    @XmlAttribute(name = "location", required = true)
    protected String location;
    @XmlAttribute(name = "size", required = true)
    protected String size;
    @XmlAttribute(name = "borderthickness", required = true)
    protected BigInteger borderthickness;
    @XmlAttribute(name = "bordercolor", required = true)
    protected String bordercolor;
    @XmlAttribute(name = "backgroundcolor", required = true)
    protected String backgroundcolor;
    @XmlAttribute(name = "gradientcolor", required = true)
    protected String gradientcolor;
    @XmlAttribute(name = "textcolor", required = true)
    protected String textcolor;
    @XmlAttribute(name = "fontfamily", required = true)
    protected String fontfamily;
    @XmlAttribute(name = "fontsize", required = true)
    protected BigInteger fontsize;
    @XmlAttribute(name = "fontbold", required = true)
    protected boolean fontbold;
    @XmlAttribute(name = "fontitalic", required = true)
    protected boolean fontitalic;

    /**
     * Obtient la valeur de la propriété refid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
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
    public void setRefid(BigInteger value) {
        this.refid = value;
    }

    /**
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtient la valeur de la propriété size.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Définit la valeur de la propriété size.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Obtient la valeur de la propriété borderthickness.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBorderthickness() {
        return borderthickness;
    }

    /**
     * Définit la valeur de la propriété borderthickness.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBorderthickness(BigInteger value) {
        this.borderthickness = value;
    }

    /**
     * Obtient la valeur de la propriété bordercolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBordercolor() {
        return bordercolor;
    }

    /**
     * Définit la valeur de la propriété bordercolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBordercolor(String value) {
        this.bordercolor = value;
    }

    /**
     * Obtient la valeur de la propriété backgroundcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setBackgroundcolor(String value) {
        this.backgroundcolor = value;
    }

    /**
     * Obtient la valeur de la propriété gradientcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradientcolor() {
        return gradientcolor;
    }

    /**
     * Définit la valeur de la propriété gradientcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradientcolor(String value) {
        this.gradientcolor = value;
    }

    /**
     * Obtient la valeur de la propriété textcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setFontsize(BigInteger value) {
        this.fontsize = value;
    }

    /**
     * Obtient la valeur de la propriété fontbold.
     * 
     */
    public boolean isFontbold() {
        return fontbold;
    }

    /**
     * Définit la valeur de la propriété fontbold.
     * 
     */
    public void setFontbold(boolean value) {
        this.fontbold = value;
    }

    /**
     * Obtient la valeur de la propriété fontitalic.
     * 
     */
    public boolean isFontitalic() {
        return fontitalic;
    }

    /**
     * Définit la valeur de la propriété fontitalic.
     * 
     */
    public void setFontitalic(boolean value) {
        this.fontitalic = value;
    }

}
