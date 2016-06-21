package by.epamlab.service.resources.reservationServices;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import by.epamlab.beans.reservation.CustomerType;
import by.epamlab.beans.reservation.EmailType;
import by.epamlab.beans.reservation.ObjectFactory;
import by.epamlab.beans.reservation.PhoneType;
import by.epamlab.service.resources.reservationDAO.CustomerDAO;

@Path("/CustomerService")
public class CustomerService {
	
   CustomerDAO customerDao = new CustomerDAO();
   private static final String SUCCESS_RESULT="<result>success</result>";
   private static final String FAILURE_RESULT="<result>failure</result>";


   @GET
   @Path("/customers")
   @Produces(MediaType.APPLICATION_XML)
   public List<CustomerType> getUsers(){
      return customerDao.getAllCustomers();
   }

   @GET
   @Path("/customers/{customerid}")
   @Produces(MediaType.APPLICATION_XML)
   public CustomerType getCustomer(@PathParam("customerid") String customerid){
      return customerDao.getCustomer(customerid);
   }

   @PUT
   @Path("/customers")
   @Produces(MediaType.APPLICATION_XML)
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
   public String createCustomer(
		   @FormParam("CustomerDocID") String id,
		   @FormParam("FirstName") String firstName,
		   @FormParam("LastName") String lastName,
		   @FormParam("Email") String email,
		   @FormParam("Phone") String phone,
		   @Context HttpServletResponse servletResponse) throws IOException {
	   ObjectFactory objectFactory = new ObjectFactory();
	   CustomerType customer = objectFactory.createCustomerType();
	   customer.setCustomerDocID(id);
	   customer.setFirstName(firstName);
	   customer.setLastName(lastName);
	   EmailType emailType = objectFactory.createEmailType();
	   emailType.setEmailAddress(email);
	   customer.setEmail(emailType);
	   PhoneType phoneType = objectFactory.createPhoneType();
	   phoneType.setPhoneNumber(phone);
	   customer.setPhone(phoneType);
	   int result = customerDao.addCustomer(customer);
	   if(result == 1){
		   return SUCCESS_RESULT;
	   }
	   return FAILURE_RESULT;
   }

   @POST
   @Path("/customers")
   @Produces(MediaType.APPLICATION_XML)
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
   public String updateCustomer(
		   @FormParam("CustomerDocID") String id,
		   @FormParam("FirstName") String firstName,
		   @FormParam("LastName") String lastName,
		   @FormParam("Email") String email,
		   @FormParam("Phone") String phone,
		   @Context HttpServletResponse servletResponse) throws IOException {
	   
	   ObjectFactory objectFactory = new ObjectFactory();
	   CustomerType customer = objectFactory.createCustomerType();
	   customer.setCustomerDocID(id);
	   customer.setFirstName(firstName);
	   customer.setLastName(lastName);
	   EmailType emailType = objectFactory.createEmailType();
	   emailType.setEmailAddress(email);
	   customer.setEmail(emailType);
	   PhoneType phoneType = objectFactory.createPhoneType();
	   phoneType.setPhoneNumber(phone);
	   customer.setPhone(phoneType);
	   int result = customerDao.updateCustomer(customer);
	   if(result == 1){
		   return SUCCESS_RESULT;
	   }
	   return FAILURE_RESULT;
	}
   

   @DELETE
   @Path("/customers/{customerid}")
   @Produces(MediaType.APPLICATION_XML)
   public String deleteCustomer(@PathParam("customerid") String customerid){
      int result = customerDao.deleteCustomer(customerid);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   @OPTIONS
   @Path("/customers")
   @Produces(MediaType.APPLICATION_XML)
   public String getSupportedOperations(){
      return "<operations>GET, PUT, POST, DELETE</operations>";
   }
}