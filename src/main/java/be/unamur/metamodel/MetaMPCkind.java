
package be.unamur.metamodel;

import javax.annotation.Generated;
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
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class MetaMPCkind {

    @XmlAttribute(name = "pathsEqual")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean pathsEqual;

    /**
     * Obtient la valeur de la propriété pathsEqual.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-07-27T11:53:17+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPathsEqual(Boolean value) {
        this.pathsEqual = value;
    }

}
