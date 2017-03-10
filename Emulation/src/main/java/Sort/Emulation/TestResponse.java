package Sort.Emulation;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
public class TestResponse {

	public void Consumer() throws JMSException{
		 Connection connection = null;
	        Session session = null;
	        Destination destination = null;
	        MessageConsumer consumer = null;


	        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://10.13.188.176:61616");
	        connection = connectionFactory.createConnection();
	        connection.start();


	        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	        destination = session.createQueue("text");


	        consumer = session.createConsumer(destination);
	        consumer.setMessageListener(new YourClass());
	}
}
