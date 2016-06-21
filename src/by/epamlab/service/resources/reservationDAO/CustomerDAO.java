package by.epamlab.service.resources.reservationDAO;

import java.util.ArrayList;
import java.util.List;

import by.epamlab.beans.reservation.ReservationType;
import by.epamlab.utils.xml.builders.ReservationBuilder;
import by.epamlab.beans.reservation.CustomerType;
import by.epamlab.beans.reservation.ObjectFactory;;

public class CustomerDAO {
	private ReservationType reservation;
	
	public List<CustomerType> getAllCustomers() {
		reservation = ReservationBuilder.xmlToObject();
		List<CustomerType> customers = new ArrayList<>();
		if(reservation != null && reservation.getCustomer() != null) {
			customers = reservation.getCustomer();
		}
		return customers;
	}
	
	public CustomerType getCustomer(String id) {
		List<CustomerType> customers = getAllCustomers();
		for(CustomerType customerType : customers) {
			if(customerType.getCustomerDocID().equals(id)) {
				return customerType;
			}
		}
		
		ObjectFactory objectFactory = new ObjectFactory();
		return objectFactory.createCustomerType();
	}
	
	public int addCustomer(CustomerType customer) {
		boolean customerExist = false;
		int numberCustomers = 0;
		List<CustomerType> customers = getAllCustomers();
		while(!customerExist && numberCustomers < customers.size()) {
			CustomerType customerType = customers.get(numberCustomers);
			customerExist = customerType != null && customerType.getCustomerDocID().equals(customer.getCustomerDocID());
			numberCustomers++;
		}
		
		if(!customerExist) {
			customers.add(customer);
			ReservationBuilder.objectToXML(reservation);
			return 1;
		}
		
		return 0;
	}
	
	public int updateCustomer(CustomerType customer) {
		List<CustomerType> customers = getAllCustomers();
		for(CustomerType customerType : customers) {
			if(customer.getCustomerDocID().equals(customerType.getCustomerDocID())) {
				int indexCustomer = customers.indexOf(customerType);
				customers.set(indexCustomer, customer);
				ReservationBuilder.objectToXML(reservation);
				return 1;
			}
		}
		return 0;
	}
	
	public int deleteCustomer(String id) {
		List<CustomerType> customers = getAllCustomers();
		for(CustomerType customer : customers) {
			if(customer.getCustomerDocID().equals(id)) {
				customers.remove(customer);
				ReservationBuilder.objectToXML(reservation);
				return 1;
			}
		}
		return 0;
	}
}
