
package be.unamur.metamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour metaMPCkind complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="metaMPCkind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pathsEqual" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaMPCkind", namespace = "http://merode.econ.kuleuven.ac.be/mermaid/mxp/1.5")
public class MetaMPCkind {

    @XmlAttribute(name = "pathsEqual")
    protected Boolean pathsEqual;

    /**
     * Obtient la valeur de la propriété pathsEqual.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPathsEqual() {
        return pathsEqual;
    }

    /**
     * Définit la valeur de la propriété pathsEqual.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPathsEqual(Boolean value) {
        this.pathsEqual = value;
    }

}
