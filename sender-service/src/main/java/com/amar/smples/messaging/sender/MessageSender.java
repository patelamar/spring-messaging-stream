package com.amar.smples.messaging.sender;

import com.amar.smples.messaging.data.AppMessage;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.UUID;


@EnableBinding(Source.class)
@EnableScheduling
@AllArgsConstructor
public class MessageSender {

    private final Source source;

    @Scheduled(fixedDelay = 1000)
    private void send() {
        AppMessage message = new AppMessage(UUID.randomUUID().toString(), "Hello");
        source.output().send(MessageBuilder.withPayload(message).build());
        System.out.println("Sent: " + message);
    }

}
