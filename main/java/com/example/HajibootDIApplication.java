package com.example;

import com.example.domain.Customer;
import com.example.repositry.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HajibootDIApplication implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... strings) throws Exception {
        Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
        System.out.println(created + " is created!");

        customerRepository.findAllOrderByName().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(HajibootDIApplication.class, args);
    }
}
