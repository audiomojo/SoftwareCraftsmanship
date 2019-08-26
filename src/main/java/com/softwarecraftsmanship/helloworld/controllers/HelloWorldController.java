package com.softwarecraftsmanship.helloworld.controllers;

import com.softwarecraftsmanship.helloworld.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return helloWorldService.helloWorld();
    }

    @RequestMapping("/helloName")
    public String helloName(@RequestParam(value = "name")String name) {
        return helloWorldService.helloName(name);
    }

}
