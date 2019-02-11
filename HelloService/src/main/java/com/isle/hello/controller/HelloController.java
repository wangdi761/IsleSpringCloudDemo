package com.isle.hello.controller;

import com.isle.hello.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }

}
