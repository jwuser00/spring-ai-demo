package com.example.springaidemo;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAiDemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringAiDemoApplication.class);
        app.run(args);
    }

}
