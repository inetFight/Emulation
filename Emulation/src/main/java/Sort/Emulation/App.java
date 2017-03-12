package Sort.Emulation;

import java.awt.Toolkit;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Timer;

import javax.jms.JMSException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Sort.Emulation.Helpers.SendsMessagesTimeController;
import Sort.Emulation.Helpers.TimeStamp;
import Sort.Emulation.Models.FromXSD.MSG;
import Sort.Emulation.Models.FromXSD.MSG.BODY;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PAB;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PIB;
import Sort.Emulation.Models.FromXSD.MSG.BODY.SRB;
import Sort.Emulation.ReceivedMessages.SORTRPL;
import Sort.Emulation.SendMessages.HEARTBEAT;
import Sort.Emulation.SendMessages.SORTREQ;
import Sort.Emulation.SendMessages.SORTRPT;
import Sort.Emulation.Service.Receiver;
import Sort.Emulation.Models.FromXSD.MSG.HEADER;
import Sort.Emulation.Models.FromXSD.ObjectFactory;





/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JMSException, JAXBException, InterruptedException {
//		Sender sender = new Sender();
		

//		Timer timer = new Timer();
//	    timer.schedule(new HEARTBEAT(), 0, 3000);
//	    timer.cancel();
//	    timer.purge();

	    ArrayList<String> s = new ArrayList<String>();
	    s.add("21321312312");
	    s.add("231232132123");
//	    
//	    SORTREQ.sendSortreq(s);
//	    SORTRPT.sendSortrpt("321312", "1111111", "PORT33");
		

		Receiver receiver = new Receiver();
    	receiver.receiveMessage("FROMAWIS");
    	
    	SORTREQ.sendSortreq(s);
    	
		
//		HEARTBEAT message = new HEARTBEAT();
//		HEADER_HEARTBEAT header = new HEADER_HEARTBEAT();
//		header.setHDSDID("COY001");
//		header.setHDRCID("NPHOST");
//		header.setHDMGTP("HEARTBEAT");
//		header.setHDMGID(1);
//		header.setHDEVTM(TimeStamp.getTimeStamp());
//		message.setBODY("");
//		message.setHEADER(header);
//		
//		JAXBContext jaxbContext = JAXBContext.newInstance(HEARTBEAT.class);
//	
//		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//		StringWriter sw = new StringWriter();
//		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
//		jaxbMarshaller.marshal(message, sw);
//		String xmlString = sw.toString();
//		sender.sendMessage(xmlString);
		
		
		
	}
}

