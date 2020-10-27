
package be.unamur.metamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}guispecialisedmethod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guispecialisedmethod"
})
@XmlRootElement(name = "guispecialisedmethods", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Guispecialisedmethods {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    protected List<Guispecialisedmethod> guispecialisedmethod;

    /**
     * Gets the value of the guispecialisedmethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guispecialisedmethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuispecialisedmethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guispecialisedmethod }
     * 
     * 
     */
    public List<Guispecialisedmethod> getGuispecialisedmethod() {
        if (guispecialisedmethod == null) {
            guispecialisedmethod = new ArrayList<Guispecialisedmethod>();
        }
        return this.guispecialisedmethod;
    }

}
