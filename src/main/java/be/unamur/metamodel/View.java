
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guidescription"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guiobjects"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guidependencies"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guiinheritances"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guievents"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guiownedmethods"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guiacquiredmethods"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guiinheritedmethods"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guispecialisedmethods"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guifsms" minOccurs="0"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guistates" minOccurs="0"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guitransitions" minOccurs="0"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}edgview"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}oetview"/>
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}fsmview"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isdefault" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guidescription",
    "guiobjects",
    "guidependencies",
    "guiinheritances",
    "guievents",
    "guiownedmethods",
    "guiacquiredmethods",
    "guiinheritedmethods",
    "guispecialisedmethods",
    "guifsms",
    "guistates",
    "guitransitions",
    "edgview",
    "oetview",
    "fsmview"
})
@XmlRootElement(name = "view", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class View {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected String guidescription;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guiobjects guiobjects;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guidependencies guidependencies;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guiinheritances guiinheritances;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guievents guievents;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guiownedmethods guiownedmethods;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guiacquiredmethods guiacquiredmethods;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guiinheritedmethods guiinheritedmethods;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Guispecialisedmethods guispecialisedmethods;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    protected Guifsms guifsms;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    protected Guistates guistates;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    protected Guitransitions guitransitions;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Edgview edgview;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Oetview oetview;
    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5", required = true)
    protected Fsmview fsmview;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "isdefault", required = true)
    protected boolean isdefault;

    /**
     * Obtient la valeur de la propriété guidescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidescription() {
        return guidescription;
    }

    /**
     * Définit la valeur de la propriété guidescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidescription(String value) {
        this.guidescription = value;
    }

    /**
     * Obtient la valeur de la propriété guiobjects.
     * 
     * @return
     *     possible object is
     *     {@link Guiobjects }
     *     
     */
    public Guiobjects getGuiobjects() {
        return guiobjects;
    }

    /**
     * Définit la valeur de la propriété guiobjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Guiobjects }
     *     
     */
    public void setGuiobjects(Guiobjects value) {
        this.guiobjects = value;
    }

    /**
     * Obtient la valeur de la propriété guidependencies.
     * 
     * @return
     *     possible object is
     *     {@link Guidependencies }
     *     
     */
    public Guidependencies getGuidependencies() {
        return guidependencies;
    }

    /**
     * Définit la valeur de la propriété guidependencies.
     * 
     * @param value
     *     allowed object is
     *     {@link Guidependencies }
     *     
     */
    public void setGuidependencies(Guidependencies value) {
        this.guidependencies = value;
    }

    /**
     * Obtient la valeur de la propriété guiinheritances.
     * 
     * @return
     *     possible object is
     *     {@link Guiinheritances }
     *     
     */
    public Guiinheritances getGuiinheritances() {
        return guiinheritances;
    }

    /**
     * Définit la valeur de la propriété guiinheritances.
     * 
     * @param value
     *     allowed object is
     *     {@link Guiinheritances }
     *     
     */
    public void setGuiinheritances(Guiinheritances value) {
        this.guiinheritances = value;
    }

    /**
     * Obtient la valeur de la propriété guievents.
     * 
     * @return
     *     possible object is
     *     {@link Guievents }
     *     
     */
    public Guievents getGuievents() {
        return guievents;
    }

    /**
     * Définit la valeur de la propriété guievents.
     * 
     * @param value
     *     allowed object is
     *     {@link Guievents }
     *     
     */
    public void setGuievents(Guievents value) {
        this.guievents = value;
    }

    /**
     * Obtient la valeur de la propriété guiownedmethods.
     * 
     * @return
     *     possible object is
     *     {@link Guiownedmethods }
     *     
     */
    public Guiownedmethods getGuiownedmethods() {
        return guiownedmethods;
    }

    /**
     * Définit la valeur de la propriété guiownedmethods.
     * 
     * @param value
     *     allowed object is
     *     {@link Guiownedmethods }
     *     
     */
    public void setGuiownedmethods(Guiownedmethods value) {
        this.guiownedmethods = value;
    }

    /**
     * Obtient la valeur de la propriété guiacquiredmethods.
     * 
     * @return
     *     possible object is
     *     {@link Guiacquiredmethods }
     *     
     */
    public Guiacquiredmethods getGuiacquiredmethods() {
        return guiacquiredmethods;
    }

    /**
     * Définit la valeur de la propriété guiacquiredmethods.
     * 
     * @param value
     *     allowed object is
     *     {@link Guiacquiredmethods }
     *     
     */
    public void setGuiacquiredmethods(Guiacquiredmethods value) {
        this.guiacquiredmethods = value;
    }

    /**
     * Obtient la valeur de la propriété guiinheritedmethods.
     * 
     * @return
     *     possible object is
     *     {@link Guiinheritedmethods }
     *     
     */
    public Guiinheritedmethods getGuiinheritedmethods() {
        return guiinheritedmethods;
    }

    /**
     * Définit la valeur de la propriété guiinheritedmethods.
     * 
     * @param value
     *     allowed object is
     *     {@link Guiinheritedmethods }
     *     
     */
    public void setGuiinheritedmethods(Guiinheritedmethods value) {
        this.guiinheritedmethods = value;
    }

    /**
     * Obtient la valeur de la propriété guispecialisedmethods.
     * 
     * @return
     *     possible object is
     *     {@link Guispecialisedmethods }
     *     
     */
    public Guispecialisedmethods getGuispecialisedmethods() {
        return guispecialisedmethods;
    }

    /**
     * Définit la valeur de la propriété guispecialisedmethods.
     * 
     * @param value
     *     allowed object is
     *     {@link Guispecialisedmethods }
     *     
     */
    public void setGuispecialisedmethods(Guispecialisedmethods value) {
        this.guispecialisedmethods = value;
    }

    /**
     * Obtient la valeur de la propriété guifsms.
     * 
     * @return
     *     possible object is
     *     {@link Guifsms }
     *     
     */
    public Guifsms getGuifsms() {
        return guifsms;
    }

    /**
     * Définit la valeur de la propriété guifsms.
     * 
     * @param value
     *     allowed object is
     *     {@link Guifsms }
     *     
     */
    public void setGuifsms(Guifsms value) {
        this.guifsms = value;
    }

    /**
     * Obtient la valeur de la propriété guistates.
     * 
     * @return
     *     possible object is
     *     {@link Guistates }
     *     
     */
    public Guistates getGuistates() {
        return guistates;
    }

    /**
     * Définit la valeur de la propriété guistates.
     * 
     * @param value
     *     allowed object is
     *     {@link Guistates }
     *     
     */
    public void setGuistates(Guistates value) {
        this.guistates = value;
    }

    /**
     * Obtient la valeur de la propriété guitransitions.
     * 
     * @return
     *     possible object is
     *     {@link Guitransitions }
     *     
     */
    public Guitransitions getGuitransitions() {
        return guitransitions;
    }

    /**
     * Définit la valeur de la propriété guitransitions.
     * 
     * @param value
     *     allowed object is
     *     {@link Guitransitions }
     *     
     */
    public void setGuitransitions(Guitransitions value) {
        this.guitransitions = value;
    }

    /**
     * Obtient la valeur de la propriété edgview.
     * 
     * @return
     *     possible object is
     *     {@link Edgview }
     *     
     */
    public Edgview getEdgview() {
        return edgview;
    }

    /**
     * Définit la valeur de la propriété edgview.
     * 
     * @param value
     *     allowed object is
     *     {@link Edgview }
     *     
     */
    public void setEdgview(Edgview value) {
        this.edgview = value;
    }

    /**
     * Obtient la valeur de la propriété oetview.
     * 
     * @return
     *     possible object is
     *     {@link Oetview }
     *     
     */
    public Oetview getOetview() {
        return oetview;
    }

    /**
     * Définit la valeur de la propriété oetview.
     * 
     * @param value
     *     allowed object is
     *     {@link Oetview }
     *     
     */
    public void setOetview(Oetview value) {
        this.oetview = value;
    }

    /**
     * Obtient la valeur de la propriété fsmview.
     * 
     * @return
     *     possible object is
     *     {@link Fsmview }
     *     
     */
    public Fsmview getFsmview() {
        return fsmview;
    }

    /**
     * Définit la valeur de la propriété fsmview.
     * 
     * @param value
     *     allowed object is
     *     {@link Fsmview }
     *     
     */
    public void setFsmview(Fsmview value) {
        this.fsmview = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété isdefault.
     * 
     */
    public boolean isIsdefault() {
        return isdefault;
    }

    /**
     * Définit la valeur de la propriété isdefault.
     * 
     */
    public void setIsdefault(boolean value) {
        this.isdefault = value;
    }

}
