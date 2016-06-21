
package by.epamlab.beans.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FormOfPaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType")
public class PaymentType {

    @XmlAttribute(name = "AmountPaid")
    protected BigDecimal amountPaid;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "FormOfPaymentTypeCode")
    protected String formOfPaymentTypeCode;

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setAmountPaid(BigDecimal value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = getValue(value);
    }

    /**
     * Gets the value of the formOfPaymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentTypeCode() {
        return formOfPaymentTypeCode;
    }

    /**
     * Sets the value of the formOfPaymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentTypeCode(String value) {
        this.formOfPaymentTypeCode = getValue(value);
    }

    @Override
    public String toString() {
        return "amountPaid=" + amountPaid +
                ", currencyCode='" + currencyCode + '\'' +
                ", formOfPaymentTypeCode='" + formOfPaymentTypeCode + '\'';
    }

    private String getValue(String value) {
        return value != null && !value.equals("") ? value : "";
    }
}
