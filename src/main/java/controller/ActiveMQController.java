package controller;

import mq.producer.queue.QueueSender;
import mq.producer.topic.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/activemq")
public class ActiveMQController {
    @Autowired
    private QueueSender queueSender;
    @Autowired
    private TopicSender topicSender;
    //发送消息至队列
    @RequestMapping("/queueSend")
    @ResponseBody
    public String queueSend(String message){
        String ops = "";
        try{
            queueSender.send("test.queue","queueSender发送"+message);
        }catch (Exception e){
            ops = e.getMessage();
        }
        return ops;
    }
    //发送消息至topic
    @RequestMapping("/topicSend")
    @ResponseBody
    public String topicSend(String message){
        String ops = "";
        try{
            topicSender.send("test.topic","topicSender发送"+message);
        }catch (Exception e){
            ops = e.getMessage();
        }
        return ops;
    }


}
