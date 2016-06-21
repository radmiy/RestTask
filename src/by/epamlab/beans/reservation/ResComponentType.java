
package by.epamlab.beans.reservation;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ResComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ComponentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="InternalStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResComponentType")
public class ResComponentType {

    @XmlAttribute(name = "ComponentTypeCode")
    protected String componentTypeCode;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected String createDateTime;
    @XmlAttribute(name = "InternalStatus")
    protected String internalStatus;
    @XmlAttribute(name = "Sequence")
    protected Integer sequence;

    /**
     * Gets the value of the componentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentTypeCode() {
        return componentTypeCode;
    }

    /**
     * Sets the value of the componentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentTypeCode(String value) {
        this.componentTypeCode = getValue(value);
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(String value) {
        this.createDateTime = getValue(value);
    }

    /**
     * Gets the value of the internalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalStatus() {
        return internalStatus;
    }

    /**
     * Sets the value of the internalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalStatus(String value) {
        this.internalStatus = getValue(value);
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
        return "componentTypeCode='" + componentTypeCode + '\'' +
                ", createDateTime='" + createDateTime + '\'' +
                ", internalStatus='" + internalStatus + '\'' +
                ", sequence=" + sequence;
    }

    private String getValue(String value) {
        return value != null && !value.equals("") ? value : "";
    }
}
