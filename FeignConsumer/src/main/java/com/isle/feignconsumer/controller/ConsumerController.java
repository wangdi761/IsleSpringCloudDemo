package com.isle.feignconsumer.controller;

import com.isle.feignconsumer.model.User;
import com.isle.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/feign-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }

    @GetMapping("/feign-consumer2")
    public String helloConsumer2() {
        return helloService.hello() + "\n" +
                helloService.hello("DIDI") + "\n" +
                helloService.hello("DIDI", 30) + "\n" +
                helloService.hello(new User("DIDI", 30)) + "\n";
    }

}
