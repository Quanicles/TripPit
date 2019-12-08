import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLConvert
{
    public static void main(String[] args)
    {
        Trip trip = new Trip();
    }

    private static void JavaToXML(Trip trip)
    {
        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(Trip.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(trip, sw);

            //Verify XML Content
            String xmlContent = sw.toString();
            System.out.println( xmlContent );

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}