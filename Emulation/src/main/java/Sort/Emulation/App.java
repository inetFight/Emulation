package Sort.Emulation;

import java.awt.Toolkit;
import java.io.StringWriter;
import java.util.Timer;

import javax.jms.JMSException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Sort.Emulation.Helpers.SendsMessagesTimeController;
import Sort.Emulation.Helpers.TimeStamp;
import Sort.Emulation.Messages.HEARTBEAT;
import Sort.Emulation.Models.FromXSD.MSG;
import Sort.Emulation.Models.FromXSD.MSG.BODY;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PAB;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PIB;
import Sort.Emulation.Models.FromXSD.MSG.BODY.SRB;
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
		

		Timer timer = new Timer();
	    timer.schedule(new HEARTBEAT(), 0, 3000);
//	    timer.cancel();
//	    timer.purge();


		Receiver receiver = new Receiver();
    	receiver.receiveMessage("MQ.NP. HOSTMFC.01");
	
		
//		HEARTBEAT message = new HEARTBEAT();+++++++++
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
		
		
		MSG sortreq = new MSG();
		HEADER header = new HEADER();
		BODY body = new BODY();
		PAB pab = new PAB();
		PIB pib = new PIB();
		SRB srb = new SRB();
		pab.setCID("1");
		pab.setDDWE("321");
		pab.setLE("10.0");
		pab.setWI("20.0");
		pab.setHE("30.0");
		pab.setVO("6000");
		pab.setET(TimeStamp.getTimeStamp());
		pab.setIU("INF01");
		pab.setIT(TimeStamp.getTimeStamp());
		pab.setTR("n");
		
		pib.setRDID("CC_IC01_01");
		pib.setRDST("GR");
		pib.setCDTP("1");
		pib.setCDDT("38472364");
		
		
		ObjectFactory factory = new ObjectFactory();
		
		JAXBElement<MSG.BODY.PIB> pib1 = factory.createMSGBODYPIB(pib);
		JAXBElement<MSG.BODY.PIB> pib2 = factory.createMSGBODYPIB(pib);
		JAXBElement<MSG.BODY.PAB> pabt = factory.createMSGBODYPAB(pab);
		
		body.getHPICOrPIBOrPAB().add(pib1);
		body.getHPICOrPIBOrPAB().add(pib2);
		body.getHPICOrPIBOrPAB().add(pabt);
		
//		header_sortreq.setHDSDID("COY001");
//		header_sortreq.setHDRCID("NPHOST");
//		header_sortreq.setHDMGTP("SORTREQ");
//		header_sortreq.setHDMGID("1");
//		header_sortreq.setHDEVTM(TimeStamp.getTimeStamp());
		

//		body_sortreq.setPAB(pab_sortreq);
//		body_sortreq.setPIB(pib_sortreq);
//		body_sortreq.setHPIC(05054664);
//		body_sortreq.setPIB(pib_sortreq1);
		
		sortreq.setBODY(body);
		sortreq.setHEADER(header);
		

		JAXBContext jaxbContext_sortreq = JAXBContext.newInstance(MSG.class);
	
		Marshaller jaxbMarshaller_sortreq = jaxbContext_sortreq.createMarshaller();
		StringWriter sw_sortreq = new StringWriter();
		jaxbMarshaller_sortreq.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller_sortreq.setProperty(Marshaller.JAXB_FRAGMENT, true);
		jaxbMarshaller_sortreq.marshal(sortreq, sw_sortreq);
		String xmlString_sortreq = sw_sortreq.toString();
//		sender.sendMessage(xmlString_sortreq, "MQ.NP. MFCHOST.01");
	}
}

