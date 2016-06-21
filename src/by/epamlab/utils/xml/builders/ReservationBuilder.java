package by.epamlab.utils.xml.builders;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import by.epamlab.beans.reservation.ReservationType;
public class ReservationBuilder {
	private static final String FILE_NAME = "c:/0004257753-full.xml";
	
	public static void objectToXML(ReservationType reservationType) {
		try {
			JAXBContext jaxbContext = null;
			Marshaller jaxbMarshaller = null;
			jaxbContext = JAXBContext.newInstance(ReservationType.class);
			jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(reservationType, sw);
			String xmlString = sw.toString();
			try(FileWriter writer = new FileWriter(FILE_NAME))
			{
				writer.write(xmlString);
				writer.flush();
			}
			catch(IOException ex){
				System.out.println(ex.getMessage());
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ReservationType xmlToObject() {
		ReservationType reservationType = null;
		try {
			JAXBContext jaxbContext = null;
			Unmarshaller jaxbUnmarshaller = null;
			jaxbContext = JAXBContext.newInstance(ReservationType.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			reservationType = (ReservationType)jaxbUnmarshaller.unmarshal(new File(FILE_NAME));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return reservationType;
	}

}
