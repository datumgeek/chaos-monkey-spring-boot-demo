package com.example.chaos.monkey.shopping.bestseller.toys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BestsellerToysApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestsellerToysApplication.class, args);
    }
}
