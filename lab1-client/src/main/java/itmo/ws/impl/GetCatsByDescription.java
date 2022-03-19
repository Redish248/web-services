
package itmo.ws.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCatsByDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCatsByDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eyesColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="furColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCatsByDescription", propOrder = {
    "eyesColor",
    "furColor"
})
public class GetCatsByDescription {

    @XmlElement(required = true)
    protected String eyesColor;
    @XmlElement(required = true)
    protected String furColor;

    /**
     * Gets the value of the eyesColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEyesColor() {
        return eyesColor;
    }

    /**
     * Sets the value of the eyesColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEyesColor(String value) {
        this.eyesColor = value;
    }

    /**
     * Gets the value of the furColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurColor() {
        return furColor;
    }

    /**
     * Sets the value of the furColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurColor(String value) {
        this.furColor = value;
    }

}
