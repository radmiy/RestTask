
package by.epamlab.beans.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryAirComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryAirComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AncillaryAirComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryAirComponentType")
public class AncillaryAirComponentType {

    @XmlAttribute(name = "AncillaryAirComponentCode")
    protected String ancillaryAirComponentCode;

    /**
     * Gets the value of the ancillaryAirComponentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncillaryAirComponentCode() {
        return ancillaryAirComponentCode;
    }

    /**
     * Sets the value of the ancillaryAirComponentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncillaryAirComponentCode(String value) {
        this.ancillaryAirComponentCode = getValue(value);
    }

    @Override
    public String toString() {
        return "AncillaryAirComponentCode='" + ancillaryAirComponentCode + '\'';
    }

    private String getValue(String value) {
        return value != null && !value.equals("") ? value : "";
    }
}
