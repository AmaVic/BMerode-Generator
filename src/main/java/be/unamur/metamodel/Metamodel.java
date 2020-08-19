
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}datatypes" minOccurs="0"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaobjects"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaevents"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metaspecialisedevents"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metadependencies"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metainheritances"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}metamethods"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lastid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datatypes",
    "metaobjects",
    "metaevents",
    "metaspecialisedevents",
    "metadependencies",
    "metainheritances",
    "metamethods"
})
@XmlRootElement(name = "metamodel")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Metamodel {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Datatypes datatypes;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metaobjects metaobjects;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metaevents metaevents;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metaspecialisedevents metaspecialisedevents;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metadependencies metadependencies;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metainheritances metainheritances;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Metamethods metamethods;
    @XmlAttribute(name = "lastid", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger lastid;

    /**
     * Obtient la valeur de la propriété datatypes.
     * 
     * @return
     *     possible object is
     *     {@link Datatypes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Datatypes getDatatypes() {
        return datatypes;
    }

    /**
     * Définit la valeur de la propriété datatypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Datatypes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDatatypes(Datatypes value) {
        this.datatypes = value;
    }

    /**
     * Obtient la valeur de la propriété metaobjects.
     * 
     * @return
     *     possible object is
     *     {@link Metaobjects }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metaobjects getMetaobjects() {
        return metaobjects;
    }

    /**
     * Définit la valeur de la propriété metaobjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Metaobjects }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetaobjects(Metaobjects value) {
        this.metaobjects = value;
    }

    /**
     * Obtient la valeur de la propriété metaevents.
     * 
     * @return
     *     possible object is
     *     {@link Metaevents }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metaevents getMetaevents() {
        return metaevents;
    }

    /**
     * Définit la valeur de la propriété metaevents.
     * 
     * @param value
     *     allowed object is
     *     {@link Metaevents }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetaevents(Metaevents value) {
        this.metaevents = value;
    }

    /**
     * Obtient la valeur de la propriété metaspecialisedevents.
     * 
     * @return
     *     possible object is
     *     {@link Metaspecialisedevents }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metaspecialisedevents getMetaspecialisedevents() {
        return metaspecialisedevents;
    }

    /**
     * Définit la valeur de la propriété metaspecialisedevents.
     * 
     * @param value
     *     allowed object is
     *     {@link Metaspecialisedevents }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetaspecialisedevents(Metaspecialisedevents value) {
        this.metaspecialisedevents = value;
    }

    /**
     * Obtient la valeur de la propriété metadependencies.
     * 
     * @return
     *     possible object is
     *     {@link Metadependencies }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metadependencies getMetadependencies() {
        return metadependencies;
    }

    /**
     * Définit la valeur de la propriété metadependencies.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadependencies }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetadependencies(Metadependencies value) {
        this.metadependencies = value;
    }

    /**
     * Obtient la valeur de la propriété metainheritances.
     * 
     * @return
     *     possible object is
     *     {@link Metainheritances }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metainheritances getMetainheritances() {
        return metainheritances;
    }

    /**
     * Définit la valeur de la propriété metainheritances.
     * 
     * @param value
     *     allowed object is
     *     {@link Metainheritances }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetainheritances(Metainheritances value) {
        this.metainheritances = value;
    }

    /**
     * Obtient la valeur de la propriété metamethods.
     * 
     * @return
     *     possible object is
     *     {@link Metamethods }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Metamethods getMetamethods() {
        return metamethods;
    }

    /**
     * Définit la valeur de la propriété metamethods.
     * 
     * @param value
     *     allowed object is
     *     {@link Metamethods }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetamethods(Metamethods value) {
        this.metamethods = value;
    }

    /**
     * Obtient la valeur de la propriété lastid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getLastid() {
        return lastid;
    }

    /**
     * Définit la valeur de la propriété lastid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-08-19T07:41:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLastid(BigInteger value) {
        this.lastid = value;
    }

}
