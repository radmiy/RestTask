
package by.epamlab.beans.reservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.math.BigDecimal;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Reservation_QNAME = new QName("", "Reservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReservationType }
     *
     */
    public ReservationType createReservationType() {
        return new ReservationType();
    }

    public ReservationType createReservationType(String code, String description) {
        ReservationType reservation = createReservationType();
        reservation.setDescription(description);
        reservation.setCode(code);
        return reservation;
    }

    /**
     * Create an instance of {@link ResComponentType }
     *
     */
    public ResComponentType createResComponentType() {
        return new ResComponentType();
    }

    public ResComponentType createResComponentType(String componentTypeCode, String createDateTime, String internalStatus, String sequence) {
        ResComponentType resComponent = createResComponentType();
        resComponent.setComponentTypeCode(componentTypeCode);
        resComponent.setCreateDateTime(createDateTime);
        resComponent.setInternalStatus(internalStatus);
        resComponent.setSequence(sequence);
        return resComponent;
    }

    /**
     * Create an instance of {@link PaymentType }
     *
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    public PaymentType createPaymentType(String amountPaid, String currencyCode, String formOfPaymentTypeCode) {
        PaymentType payment = createPaymentType();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        try {
            bigDecimal = amountPaid != null && !amountPaid.equals("") ? new BigDecimal(amountPaid) : BigDecimal.ZERO;
        }catch (Exception err) {

        }
        payment.setAmountPaid(bigDecimal);
        payment.setCurrencyCode(currencyCode);
        payment.setFormOfPaymentTypeCode(formOfPaymentTypeCode);
        return payment;
    }

    /**
     * Create an instance of {@link CustomerType }
     *
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    public CustomerType createCustomerType(String customerDocID, String firstName, String lastName, String sequence) {
        CustomerType customer = createCustomerType();
        customer.setCustomerDocID(customerDocID);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setSequence(sequence);
        return customer;
    }

    /**
     * Create an instance of {@link AncillaryAirComponentType }
     *
     */
    public AncillaryAirComponentType createAncillaryAirComponentType() {
        return new AncillaryAirComponentType();
    }

    public AncillaryAirComponentType createAncillaryAirComponentType(String ancillaryAirComponentCode) {
        AncillaryAirComponentType ancillaryAirComponent = createAncillaryAirComponentType();
        ancillaryAirComponent.setAncillaryAirComponentCode(ancillaryAirComponentCode);
        return ancillaryAirComponent;
    }

    /**
     * Create an instance of {@link EmailType }
     *
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    public EmailType createEmailType(String def, String emailAddress, String emailType, String sequence, String syncStatus) {
        EmailType email = createEmailType();
        email.setDefault(def);
        email.setEmailAddress(emailAddress);
        email.setEmailType(emailType);
        email.setSequence(sequence);
        email.setSyncStatus(syncStatus);
        return email;
    }

    /**
     * Create an instance of {@link PhoneType }
     *
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    public PhoneType createPhoneType(String def, String phoneNumber, String phoneType, String sequence, String syncStatus) {
        PhoneType phone = createPhoneType();
        phone.setDefault(def);
        phone.setPhoneNumber(phoneNumber);
        phone.setPhoneType(phoneType);
        phone.setSequence(sequence);
        phone.setSyncStatus(syncStatus);
        return phone;
    }

    /**
     * Create an instance of {@link FareFamilyType }
     *
     */
    public FareFamilyType createFareFamilyType() {
        return new FareFamilyType();
    }

    public FareFamilyType createFareFamilyType(String fareFamilyCode) {
        FareFamilyType fareFamily = createFareFamilyType();
        fareFamily.setFareFamilyCode(fareFamilyCode);
        return fareFamily;
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ReservationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reservation")
    public JAXBElement<ReservationType> createReservation(ReservationType value) {
        return new JAXBElement<ReservationType>(_Reservation_QNAME, ReservationType.class, null, value);
    }
}
