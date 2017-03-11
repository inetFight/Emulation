package Sort.Emulation.Service;

import java.io.StringReader;
import java.util.ArrayList;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Sort.Emulation.Models.FromXSD.MSG;
import Sort.Emulation.Models.FromXSD.MSG.BODY;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PAB;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PIB;
import Sort.Emulation.Models.FromXSD.MSG.HEADER;
import Sort.Emulation.Models.FromXSD.ObjectFactory;

public class getMessageController implements MessageListener {
		

		public void onMessage(Message message) {
			TextMessage textMessage = (TextMessage) message;
            try {
            	System.out.println("--------------------------Полученное сообщение---------------------------");
				System.out.println(textMessage.getText());
				System.out.println("--------------------------Конец полученного сообщения---------------------------");
				JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				StringReader reader = new StringReader(textMessage.getText());
				MSG msg = (MSG) unmarshaller.unmarshal(reader);
				
				HEADER head = msg.getHEADER();
				BODY body = msg.getBODY();
				String HDSDID = head.getHDSDID();
				String HDRCID = head.getHDRCID();
				String HDMGTP = head.getHDMGTP();
				String HDMGID = head.getHDMGID();
				String HDEVTM = head.getHDEVTM();
				String HPIC = null;
				ArrayList<String> DID = new ArrayList<String>();
				PIB pib = null;
				PAB pab = null;
				
				for (JAXBElement<?> element : body.getHPICOrPIBOrPAB()) {
					if(element.getName().toString().equals("HPIC")){
						HPIC = (String) element.getValue();
					}
					if(element.getName().toString().equals("DID")){
						DID.add((String) element.getValue());
						
					}
					if(element.getName().toString().equals("PIB")){
						pib = (PIB) element.getValue();
					}
					if(element.getName().toString().equals("PAB")){
						pab = (PAB) element.getValue();
					}
				}
				System.out.println(pib.getRDID());
				message.acknowledge();
			} catch (JMSException e) {
				
				e.printStackTrace();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
			
		}
		}

