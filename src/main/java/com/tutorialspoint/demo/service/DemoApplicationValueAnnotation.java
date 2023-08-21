package com.tutorialspoint.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplicationValueAnnotation {
    @Value("${spring.application.name}")
    private String name;
    public static void main(String args[])
    {
        SpringApplication.run(DemoApplicationValueAnnotation.class, args);
    }

    @RequestMapping(value="/test")
    public String name()
    {
        System.out.println("In request method");
        return name;
    }
}
