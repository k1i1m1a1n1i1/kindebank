package com.kindebank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KindebankApplication {

    public static void main(String[] args) {
        SpringApplication.run(KindebankApplication.class, args);
        System.out.println("✅ Kindebank Spring Boot Application started...");
    }
}

