package com.amar.smples.message.receiver1;

import com.amar.smples.messaging.data.AppMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;

@EnableBinding(Sink.class)
@MessageEndpoint
public class MessageReceiver {

    @StreamListener(Sink.INPUT)
    private void receive(AppMessage message) {
        System.out.println("Received: " + message);
    }

}
