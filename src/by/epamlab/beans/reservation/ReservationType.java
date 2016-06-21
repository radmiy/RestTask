
package by.epamlab.beans.reservation;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResComponent" type="{}ResComponentType" maxOccurs="unbounded"/>
 *         &lt;element name="Customer" type="{}CustomerType" maxOccurs="unbounded"/>
 *         &lt;element name="FareFamily" type="{}FareFamilyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationType", propOrder = {
    "resComponent",
    "customer",
    "fareFamily"
})
@XmlRootElement(name = "Reservation")
public class ReservationType {

    @XmlElement(name = "ResComponent", required = true)
    protected List<ResComponentType> resComponent;
    @XmlElement(name = "Customer", required = true)
    protected List<CustomerType> customer;
    @XmlElement(name = "FareFamily", required = true)
    protected List<FareFamilyType> fareFamily;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Gets the value of the resComponent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resComponent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResComponent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResComponentType }
     *
     *
     */
    public List<ResComponentType> getResComponent() {
        if (resComponent == null) {
            resComponent = new ArrayList<ResComponentType>();
        }
        return this.resComponent;
    }

    /**
     * Gets the value of the customer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType }
     *
     *
     */
    public List<CustomerType> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<CustomerType>();
        }
        return this.customer;
    }

    /**
     * Gets the value of the fareFamily property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareFamily property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareFamily().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareFamilyType }
     * 
     * 
     */
    public List<FareFamilyType> getFareFamily() {
        if (fareFamily == null) {
            fareFamily = new ArrayList<FareFamilyType>();
        }
        return this.fareFamily;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCode(String value) {
        this.code = getValue(value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = getValue(value);
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("ReservationType { ");
        toString.append("Code='" + code + "', description='" + description + "',\n");

        if(this.resComponent != null && this.resComponent.size() != 0 ) {
            for(int indexResComp = 0; indexResComp < this.resComponent.size(); indexResComp++) {
                toString.append("   ResComponent {" + this.resComponent.get(indexResComp) + "   }\n");
            }
        }

        if(this.customer != null && this.customer.size() != 0 ) {
            for(int indexCust = 0; indexCust < this.customer.size(); indexCust++) {
                toString.append("   Customer {" + this.customer.get(indexCust) + "   }\n");
            }
        }

        if(this.fareFamily != null && this.fareFamily.size() != 0 ) {
            for(int indexFare = 0; indexFare < this.fareFamily.size(); indexFare++) {
                toString.append("   FareFamily {" + this.fareFamily.get(indexFare) + "   }\n");
            }
        }
        return toString.toString();
    }

    private String getValue(String value) {
        return value != null && !value.equals("") ? value : "";
    }
}
