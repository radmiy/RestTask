
package by.epamlab.beans.reservation;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Email" type="{}EmailType"/>
 *         &lt;element name="Phone" type="{}PhoneType"/>
 *         &lt;element name="Payment" type="{}PaymentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CustomerDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "email",
    "phone",
    "payment"
})
@XmlRootElement(name = "customer")
public class CustomerType {

    @XmlElement(name = "Email", required = true)
    protected EmailType email;
    @XmlElement(name = "Phone", required = true)
    protected PhoneType phone;
    @XmlElement(name = "Payment", required = false)
    protected List<PaymentType> payment;
    @XmlAttribute(name = "CustomerDocID")
    protected String customerDocID;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "Sequence")
    protected Integer sequence;

    /**
     * Gets the value of the email property.
     *
     * @return
     *     {@link EmailType }
     *
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return
     *     possible object is
     *     {@link PhoneType }
     *
     */
    public PhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *
     */
    public void setPhone(PhoneType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the payment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     *
     *
     */
    public List<PaymentType> getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentType>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the customerDocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDocID() {
        return customerDocID;
    }

    /**
     * Sets the value of the customerDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDocID(String value) {
        this.customerDocID = getValue(value);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = getValue(value);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = getValue(value);
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(String value) {
        int seq = 0;
        try {
            seq = value != null && !value.equals("") ? Integer.parseInt(value) : 0;
        }catch (NumberFormatException err) {
            seq = 0;
        }
        this.sequence = seq;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append(
                " CustomerDocID='" + customerDocID + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Sequence=" + sequence +
                ", \n       Email=" + email +
                ", \n       Phone=" + phone + "\n");
        if(this.payment != null && this.payment.size() != 0 ) {
            for(int indexPayment = 0; indexPayment < this.payment.size(); indexPayment++) {
                toString.append("       Payment {" + this.payment.get(indexPayment) + "       }\n");
            }
        }
        return toString.toString();
    }

    private String getValue(String value) {
        return value != null && !value.equals("") ? value : "";
    }
}
