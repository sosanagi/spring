package com.example;

import java.util.Scanner;

import com.example.app.Frontend;
// import com.example.app.Argument;
// import com.example.app.ArgumentResolver;
// import com.example.app.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDIApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HajibootDIApplication.class, args);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter 2 numbers like 'a b' :");
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();

        // Calculator calculator = context.getBean(Calculator.class);
        // int result = calculator.calc(argument.getA(), argument.getB());

        // System.out.println("result = " + result);
        Frontend frontend = context.getBean(Frontend.class);
        frontend.run();
    }
}
