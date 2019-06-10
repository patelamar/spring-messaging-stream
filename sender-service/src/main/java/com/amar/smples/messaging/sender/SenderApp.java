package com.amar.smples.messaging.sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenderApp {

    public static void main(String[] args) {
        SpringApplication.run(SenderApp.class, args).registerShutdownHook();
    }

}
