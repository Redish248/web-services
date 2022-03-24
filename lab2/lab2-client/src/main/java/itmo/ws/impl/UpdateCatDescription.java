
package itmo.ws.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCatDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCatDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "updateCatDescription", propOrder = {
    "uid",
    "eyesColor",
    "furColor"
})
public class UpdateCatDescription {

    protected int uid;
    @XmlElement(required = true)
    protected String eyesColor;
    @XmlElement(required = true)
    protected String furColor;

    /**
     * Gets the value of the uid property.
     * 
     */
    public int getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     */
    public void setUid(int value) {
        this.uid = value;
    }

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
