package com.amar.smples.messaging.distributor;

import com.amar.smples.messaging.data.AppMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class MessageDistributor {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    AppMessage distribute(AppMessage message) {
        System.out.println("Distributed: " + message);
        return message;
    }

}
