
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
 *         &lt;element ref="{http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5}edgecontrolpoint" maxOccurs="unbounded" minOccurs="0"/>
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
    "edgecontrolpoint"
})
@XmlRootElement(name = "edgecontrolpoints", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class Edgecontrolpoints {

    @XmlElement(namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
    protected List<Edgecontrolpoint> edgecontrolpoint;

    /**
     * Gets the value of the edgecontrolpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edgecontrolpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdgecontrolpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Edgecontrolpoint }
     * 
     * 
     */
    public List<Edgecontrolpoint> getEdgecontrolpoint() {
        if (edgecontrolpoint == null) {
            edgecontrolpoint = new ArrayList<Edgecontrolpoint>();
        }
        return this.edgecontrolpoint;
    }

}
