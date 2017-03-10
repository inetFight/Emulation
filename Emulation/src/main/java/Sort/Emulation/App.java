package Sort.Emulation;

import javax.jms.JMSException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JMSException {
//		Sender sender = new Sender();
//		sender.sendMessage();
		Receiver receiver = new Receiver();
		receiver.receiveMessage();
//		TestResponse response = new TestResponse();
//		response.Consumer();
		

	}
}

