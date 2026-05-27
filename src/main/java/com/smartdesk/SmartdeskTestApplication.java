package com.smartdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SmartdeskTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartdeskTestApplication.class, args);
    }

    @GetMapping("/health")
    public String health() {
        return "Hello from Jenkins + Docker!";
    }
}