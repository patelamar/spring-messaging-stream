package com.amar.smples.message.receiver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Receiver1App {

    public static void main(String[] args) {
        SpringApplication.run(Receiver1App.class, args).registerShutdownHook();
    }

}
