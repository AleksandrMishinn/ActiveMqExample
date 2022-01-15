package com.tutorials.mishin.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {

    @JmsListener(destination = "messages")
    public void processMessages(String message) {
        System.out.println("Message has been read:" + message);
    }
}
