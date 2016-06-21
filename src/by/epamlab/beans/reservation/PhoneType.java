
package by.epamlab.beans.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="PhoneType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType")
public class PhoneType {

    @XmlAttribute(name = "Default")
    protected Boolean _default;
    @XmlAttribute(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlAttribute(name = "PhoneType")
    protected String phoneType;
    @XmlAttribute(name = "Sequence")
    protected Integer sequence;
    @XmlAttribute(name = "SyncStatus")
    protected String syncStatus;

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(String value) {
        boolean def = false;
        try {
            def = value != null && !value.equals("") ? Boolean.parseBoolean(value) : false;
        }catch (Exception err) {

        }
        this._default = def;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = getValue(value);
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = getValue(value);
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

    /**
     * Gets the value of the syncStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncStatus(String value) {
        this.syncStatus = getValue(value);
    }

    @Override
    public String toString() {
        return "Default=" + _default +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", phoneType='" + phoneType + '\'' +
                ", sequence=" + sequence +
                ", syncStatus='" + syncStatus + '\'';
    }

    private String getValue(String value) {
        return value != null && !value.equals("") ? value : "";
    }
}
