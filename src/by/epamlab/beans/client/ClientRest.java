package by.epamlab.beans.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import by.epamlab.beans.reservation.CustomerType;

public class ClientRest  {
	private Client client;
	private String REST_SERVICE_URL = "http://localhost:8080/RestTask/rest/CustomerService/customers/";
	private static final String SUCCESS_RESULT="<result>success</result>";

	private void init() {
		this.client = ClientBuilder.newClient();
	}

	public static void main(String[] args) {
	   ClientRest clientRest = new ClientRest();
	   clientRest.init();
      
	   System.out.println("\nGet all customers.");
	   clientRest.getAllCustomers();
	   System.out.println("\nAdd customer with ID=\"1\".");
	   clientRest.addCustomer();
	   clientRest.getAllCustomers();
	   System.out.println("\nUpdate customer with ID=\"1\".");
	   clientRest.updateCustomer("1");
	   clientRest.getAllCustomers();
	   System.out.println("\nDelete customer with ID=\"1\".");
	   clientRest.deleteCustomer();
	   System.out.println("\nGet customer with ID=\"1\".");
	   clientRest.getCustomer("1");
	}

   	private void getAllCustomers() {
	   GenericType<List<CustomerType>> list = new GenericType<List<CustomerType>>() {};
	   List<CustomerType> customers = client
			   .target(REST_SERVICE_URL)
			   .request(MediaType.APPLICATION_XML)
			   .get(list);
	   if(customers.isEmpty()){
		   System.out.println("No customer in reservation.");
		   return;
	   }
	   for(CustomerType customer : customers) {
		   System.out.println(customer.toString());
	   }
	}

	private void getCustomer(String id) {
	   CustomerType customerType = client
			   .target(REST_SERVICE_URL)
			   .path("/{customerid}")
			   .resolveTemplate("customerid", id)
			   .request(MediaType.APPLICATION_XML)
			   .get(CustomerType.class);
	   if(customerType == null || customerType.getCustomerDocID() == null) {
		   System.out.println("No customer with id = \"" + id + "\"");
		   return;
	   }
	   System.out.println(customerType.toString());
	}

	private void updateCustomer (String id){
		Form form = new Form();
		form.param("CustomerDocID", id);
		form.param("FirstName", "Dmitriy");
		form.param("LastName", "Rabykin");
		form.param("Email", "radmiyrdv@gmail.com");
		form.param("Phone", "+375293672928");

		String callResult = client
				.target(REST_SERVICE_URL)
				.request(MediaType.APPLICATION_XML)
				.post(Entity.entity(form,
						MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						String.class);
		
		if(!SUCCESS_RESULT.equals(callResult)){
			System.out.println("The customer is not update");
			return;
		}
	}

	private void addCustomer() {
		Form form = new Form();
		form.param("CustomerDocID", "1");
		form.param("FirstName", "TestAdd");
		form.param("LastName", "Customer");
		form.param("Email", "test@customer.by");
		form.param("Phone", "+123456789000");

		String callResult = client
				.target(REST_SERVICE_URL)
				.request(MediaType.APPLICATION_XML)
				.put(Entity.entity(form,
						MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						String.class);
   
		if(!SUCCESS_RESULT.equals(callResult)){
			System.out.println("The customer is not added.");
			return;
		}
	}

	private void deleteCustomer()
	{
		String callResult = client
				.target(REST_SERVICE_URL)
				.path("/{customerid}")
				.resolveTemplate("customerid", "1")
				.request(MediaType.APPLICATION_XML)
				.delete(String.class);

		if(!SUCCESS_RESULT.equals(callResult)){
			System.out.println("The customer is not deleted.");
			return;
		}

		System.out.println("The customer is deleted.");
	}
}
