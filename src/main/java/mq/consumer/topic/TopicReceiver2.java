package mq.consumer.topic;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
@Service
public class TopicReceiver2 implements MessageListener {
    public void onMessage(Message message) {
        try {
            System.out.println("TopicReceiver2接收"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
