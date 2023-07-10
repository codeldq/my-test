package com.example.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyTestApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello 7.10");
        SpringApplication.run(MyTestApplication.class, args);
    }

}
