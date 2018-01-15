package mq.producer.queue;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Service
public class QueueSender {
    @Resource
    private JmsTemplate jmsQueueTemplate;
    public void send(String queueName,final String message){
    jmsQueueTemplate.send(queueName, new MessageCreator() {
        public Message createMessage(Session session) throws JMSException {
            return session.createTextMessage(message);
        }
    });
    }
}
