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

import Sort.Emulation.Gui.Gui;
import Sort.Emulation.Models.FromXSD.MSG;
import Sort.Emulation.Models.FromXSD.MSG.BODY;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PAB;
import Sort.Emulation.Models.FromXSD.MSG.BODY.PIB;
import Sort.Emulation.Models.FromXSD.MSG.HEADER;
import Sort.Emulation.Models.FromXSD.ObjectFactory;
import Sort.Emulation.ReceivedMessages.SORTACK;
import Sort.Emulation.ReceivedMessages.SORTRPL;

public class MessageController implements MessageListener {

	public void onMessage(final Message message) {
		
		new Thread(){
		      public void run(){
		    	  try {
		  			
		    		  TextMessage textMessage = (TextMessage) message;
		  			Gui.receiverLog.append("----------------------------------------Принятое сообщение---------------------------------------\n");
		  			Gui.receiverLog.append(textMessage.getText());
		  			Gui.receiverLog.append("\n-----------------------------------Конец принятого сообщения----------------------------------\n");
//		  			System.out.println("--------------------------Полученное сообщение---------------------------");
//		  			System.out.println(textMessage.getText());
//		  			System.out.println("--------------------------Конец полученного сообщения---------------------------");
		  			StringReader reader = new StringReader(textMessage.getText());
		  			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
		  			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		  			MSG msg = (MSG) unmarshaller.unmarshal(reader);
		  			HEADER head = msg.getHEADER();
		  			String messageType = head.getHDMGTP();
		  			if (messageType.equals("SORTRPL")) {
		  				SORTRPL.sortrplLogic(msg);
		  			}
		  			if (messageType.equals("SORTACK")) {
		  				
		  				SORTACK.sortackLogic(msg);
		  			}
		  			message.acknowledge();
		  		} catch (Exception e) {
		  			// TODO: handle exception
		  		}  
		    	  
		      }}.start();;
		
	}
}
