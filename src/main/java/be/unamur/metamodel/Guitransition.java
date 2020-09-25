
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
public class Guitransition {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Edgecontrolpoints edgecontrolpoints;
    @XmlAttribute(name = "refid", required = true)
    protected BigInteger refid;
    @XmlAttribute(name = "linewidth", required = true)
    protected BigInteger linewidth;
    @XmlAttribute(name = "linecolor", required = true)
    protected String linecolor;
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
    @XmlAttribute(name = "labelvisible", required = true)
    protected boolean labelvisible;
    @XmlAttribute(name = "labelposition", required = true)
    protected String labelposition;

    /**
     * Obtient la valeur de la propriété edgecontrolpoints.
     * 
     * @return
     *     possible object is
     *     {@link Edgecontrolpoints }
     *     
     */
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
     * Obtient la valeur de la propriété linewidth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
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

    /**
     * Obtient la valeur de la propriété labelvisible.
     * 
     */
    public boolean isLabelvisible() {
        return labelvisible;
    }

    /**
     * Définit la valeur de la propriété labelvisible.
     * 
     */
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
    public void setLabelposition(String value) {
        this.labelposition = value;
    }

}
