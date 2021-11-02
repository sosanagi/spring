package com.example;

import com.example.app.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HajibootDIApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HajibootDIApplication.class, args);
        Frontend frontend = context.getBean(Frontend.class);
        frontend.run();
    }
}
