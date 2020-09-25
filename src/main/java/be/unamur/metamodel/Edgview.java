
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
 *       &lt;attribute name="gridcolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backgroundcolor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gridenabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gridvisible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gridmode" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="gridsize" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="scale" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "edgview", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Edgview {

    @XmlAttribute(name = "gridcolor", required = true)
    protected String gridcolor;
    @XmlAttribute(name = "backgroundcolor", required = true)
    protected String backgroundcolor;
    @XmlAttribute(name = "gridenabled", required = true)
    protected boolean gridenabled;
    @XmlAttribute(name = "gridvisible", required = true)
    protected boolean gridvisible;
    @XmlAttribute(name = "gridmode", required = true)
    protected BigInteger gridmode;
    @XmlAttribute(name = "gridsize", required = true)
    protected BigInteger gridsize;
    @XmlAttribute(name = "scale", required = true)
    protected double scale;

    /**
     * Obtient la valeur de la propriété gridcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridcolor() {
        return gridcolor;
    }

    /**
     * Définit la valeur de la propriété gridcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridcolor(String value) {
        this.gridcolor = value;
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
     * Obtient la valeur de la propriété gridenabled.
     * 
     */
    public boolean isGridenabled() {
        return gridenabled;
    }

    /**
     * Définit la valeur de la propriété gridenabled.
     * 
     */
    public void setGridenabled(boolean value) {
        this.gridenabled = value;
    }

    /**
     * Obtient la valeur de la propriété gridvisible.
     * 
     */
    public boolean isGridvisible() {
        return gridvisible;
    }

    /**
     * Définit la valeur de la propriété gridvisible.
     * 
     */
    public void setGridvisible(boolean value) {
        this.gridvisible = value;
    }

    /**
     * Obtient la valeur de la propriété gridmode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGridmode() {
        return gridmode;
    }

    /**
     * Définit la valeur de la propriété gridmode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGridmode(BigInteger value) {
        this.gridmode = value;
    }

    /**
     * Obtient la valeur de la propriété gridsize.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGridsize() {
        return gridsize;
    }

    /**
     * Définit la valeur de la propriété gridsize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGridsize(BigInteger value) {
        this.gridsize = value;
    }

    /**
     * Obtient la valeur de la propriété scale.
     * 
     */
    public double getScale() {
        return scale;
    }

    /**
     * Définit la valeur de la propriété scale.
     * 
     */
    public void setScale(double value) {
        this.scale = value;
    }

}
