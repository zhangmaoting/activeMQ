package mq.consumer.topic;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.xml.soap.Text;
@Service
public class TopicReceiver1 implements MessageListener {
    public void onMessage(Message message) {
        try {
            System.out.println("TopicReceiver1接收"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
