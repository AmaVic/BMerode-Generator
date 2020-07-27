
package be.unamur.metamodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}view" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="currentview" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="topview.lastid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "view"
})
@XmlRootElement(name = "guimodel", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Guimodel {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<View> view;
    @XmlAttribute(name = "currentview", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger currentview;
    @XmlAttribute(name = "topview.lastid", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger topviewLastid;

    /**
     * Gets the value of the view property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the view property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link View }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<View> getView() {
        if (view == null) {
            view = new ArrayList<View>();
        }
        return this.view;
    }

    /**
     * Obtient la valeur de la propriété currentview.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getCurrentview() {
        return currentview;
    }

    /**
     * Définit la valeur de la propriété currentview.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCurrentview(BigInteger value) {
        this.currentview = value;
    }

    /**
     * Obtient la valeur de la propriété topviewLastid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getTopviewLastid() {
        return topviewLastid;
    }

    /**
     * Définit la valeur de la propriété topviewLastid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTopviewLastid(BigInteger value) {
        this.topviewLastid = value;
    }

}
