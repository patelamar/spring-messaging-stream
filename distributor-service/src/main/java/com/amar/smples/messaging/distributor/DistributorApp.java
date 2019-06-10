package com.amar.smples.messaging.distributor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistributorApp {

    public static void main(String[] args) {
        SpringApplication.run(DistributorApp.class, args).registerShutdownHook();
    }

}
