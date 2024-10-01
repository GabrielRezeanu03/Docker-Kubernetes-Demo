package com.example.demo;  // Ensure this matches your package structure

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // This tells Spring Boot that this class is a REST controller
public class HelloController {

    @GetMapping("/")  // This maps the HTTP GET request to the "/" endpoint
    public String hello() {
        return "Hello from Docker and Kubernetes with Java!";
    }
}
