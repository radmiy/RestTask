
package by.epamlab.beans.reservation;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FareFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AncillaryAirComponent" type="{}AncillaryAirComponentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FareFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyType", propOrder = {
    "ancillaryAirComponent"
})
public class FareFamilyType {

    @XmlElement(name = "AncillaryAirComponent", required = true)
    protected List<AncillaryAirComponentType> ancillaryAirComponent;
    @XmlAttribute(name = "FareFamilyCode")
    protected String fareFamilyCode;

    /**
     * Gets the value of the ancillaryAirComponent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryAirComponent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryAirComponent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryAirComponentType }
     *
     *
     */
    public List<AncillaryAirComponentType> getAncillaryAirComponent() {
        if (ancillaryAirComponent == null) {
            ancillaryAirComponent = new ArrayList<AncillaryAirComponentType>();
        }
        return this.ancillaryAirComponent;
    }

    /**
     * Gets the value of the fareFamilyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    /**
     * Sets the value of the fareFamilyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyCode(String value) {
        this.fareFamilyCode = getValue(value);
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append(" FareFamilyCode='" + fareFamilyCode + "',\n");
        if(this.ancillaryAirComponent!= null && this.ancillaryAirComponent.size() != 0 ) {
            for(int indexAncillary = 0; indexAncillary < this.ancillaryAirComponent.size(); indexAncillary++) {
                toString.append("       AncillaryAirComponent {" + this.ancillaryAirComponent.get(indexAncillary) + "       }\n");
            }
        }
        return toString.toString();
    }

    private String getValue(String value) {
        return value != null && !value.equals("") ? value : "";
    }
}
