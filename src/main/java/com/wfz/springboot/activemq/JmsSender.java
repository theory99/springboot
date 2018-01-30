package com.wfz.springboot.activemq;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 * @author admin
 */
@Component
public class JmsSender {

	@Autowired
    private Queue queue;
    
    @Autowired
    private Topic topic;
    
    @Autowired
    private JmsMessagingTemplate jmsTemplate;
    
    public void sendByQueue(String message) {
        this.jmsTemplate.convertAndSend(queue, message);
    }
    
    public void sendByTopic(String message) {
        this.jmsTemplate.convertAndSend(topic, message);
    }
}
