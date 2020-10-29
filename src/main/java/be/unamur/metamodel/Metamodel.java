
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}ept"/>
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
    "ept",
    "datatypes",
    "metaobjects",
    "metaevents",
    "metaspecialisedevents",
    "metadependencies",
    "metainheritances",
    "metamethods"
})
@XmlRootElement(name = "metamodel", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Metamodel {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Ept ept;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    protected Datatypes datatypes;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metaobjects metaobjects;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metaevents metaevents;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metaspecialisedevents metaspecialisedevents;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metadependencies metadependencies;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metainheritances metainheritances;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Metamethods metamethods;
    @XmlAttribute(name = "lastid", required = true)
    protected BigInteger lastid;

    /**
     * Obtient la valeur de la propriété ept.
     * 
     * @return
     *     possible object is
     *     {@link Ept }
     *     
     */
    public Ept getEpt() {
        return ept;
    }

    /**
     * Définit la valeur de la propriété ept.
     * 
     * @param value
     *     allowed object is
     *     {@link Ept }
     *     
     */
    public void setEpt(Ept value) {
        this.ept = value;
    }

    /**
     * Obtient la valeur de la propriété datatypes.
     * 
     * @return
     *     possible object is
     *     {@link Datatypes }
     *     
     */
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
    public void setLastid(BigInteger value) {
        this.lastid = value;
    }

}
