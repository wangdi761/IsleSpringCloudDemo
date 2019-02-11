package com.isle.feignconsumer.service;

import com.isle.feignconsumer.model.User;
import com.isle.feignconsumer.service.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "HELLO-SERVICE", fallback = HelloServiceFallback.class)
public interface HelloService {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/hello1")
    String hello(@RequestParam("name") String name);

    @GetMapping("/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}
