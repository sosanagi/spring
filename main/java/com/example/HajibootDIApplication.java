package com.example;

import com.example.domain.Customer;
import com.example.repositry.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootApplication
public class HajibootDIApplication implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... strings) throws Exception {
        Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
        System.out.println(created + " is created!");

        // @see https://stackoverflow.com/questions/44848653/pagerequest-constructors-have-been-deprecated
        Pageable pageable = PageRequest.of(0,3);
        Page<Customer> page = customerRepository.findAllOrderByName(pageable);
        System.out.println("1ページのデータ数=" + page.getSize());
        System.out.println("現在のページ=" + page.getNumber());
        System.out.println("全ページ数=" + page.getTotalPages());
        System.out.println("全データ数=" + page.getTotalElements());

        page.getContent().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(HajibootDIApplication.class, args);
    }
}
