
package itmo.ws.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eyesColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="furColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="breed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCat", propOrder = {
    "name",
    "age",
    "eyesColor",
    "furColor",
    "breed",
    "ownerName"
})
public class CreateCat {

    @XmlElement(required = true)
    protected String name;
    protected int age;
    @XmlElement(required = true)
    protected String eyesColor;
    @XmlElement(required = true)
    protected String furColor;
    @XmlElement(required = true)
    protected String breed;
    @XmlElement(required = true)
    protected String ownerName;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
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

    /**
     * Gets the value of the breed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the value of the breed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreed(String value) {
        this.breed = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

}
