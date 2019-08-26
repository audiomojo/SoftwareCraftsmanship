package com.softwarecraftsmanship.helloworld.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld() {
        return "Hello World";
    }

    public String helloName(String name) {
        return "Hello " + name;
    }
}
