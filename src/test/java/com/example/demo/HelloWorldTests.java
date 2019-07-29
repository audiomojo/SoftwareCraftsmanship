package com.example.demo;

import com.example.demo.services.HelloWorldService;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTests {
    @Test
    public void helloWorldTest_helloWorld() {
        HelloWorldService helloWorldService = new HelloWorldService();
        String expected = "Hello World";
        String result = helloWorldService.helloWorld();
        Assert.assertEquals("Result should be <" + expected + "> but was <" + result + ">", expected, result);
    }

    @Test
    public void helloWorldTest_helloName() {
        HelloWorldService helloWorldService = new HelloWorldService();
        String name = "Zeke T. Prescott III, Esq";
        String expected = "Hello " + name;
        String result = helloWorldService.helloName(name);
        Assert.assertEquals("Result should be <" + expected + "> but was <" + result + ">", expected, result);
    }
}
