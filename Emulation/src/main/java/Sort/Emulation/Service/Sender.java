package Sort.Emulation.Service;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Sender {

	private ConnectionFactory factory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	private MessageProducer producer = null;

	public Sender() {

	}

	public void sendMessage(String messageToSend) {

		try {
			factory = new ActiveMQConnectionFactory("tcp://10.13.188.176:61616");
			connection = factory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			destination = session.createQueue("TOAWIS");
			producer = session.createProducer(destination);
			TextMessage message = session.createTextMessage();
			message.setText(messageToSend);
			producer.send(message);
			System.out.println("--------------------------Отправленное сообщение---------------------------");
			System.out.println(message.getText());
			System.out.println("--------------------------Конец отправленного сообщения---------------------");
			
			session.close();
			connection.close();
			
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}}

