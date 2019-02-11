package com.isle.helloserviceapi.service;

import com.isle.helloserviceapi.model.User;
import org.springframework.web.bind.annotation.*;

public interface HelloService {

    @GetMapping("/hello4")
    String hello(@RequestParam("name") String name);

    @GetMapping("/hello5")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @PostMapping("/hello6")
    String hello(@RequestBody User user);

}
