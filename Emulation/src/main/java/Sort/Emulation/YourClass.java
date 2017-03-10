package Sort.Emulation;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class YourClass implements MessageListener {
		

		public void onMessage(Message message) {
			TextMessage textMessage = (TextMessage) message;
            try {
				System.out.println(textMessage.getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           //do what ever you want with inputJsonString
            try {
				message.acknowledge();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		}

