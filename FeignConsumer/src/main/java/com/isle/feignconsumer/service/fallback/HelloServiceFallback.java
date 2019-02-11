package com.isle.feignconsumer.service.fallback;

import com.isle.feignconsumer.model.User;
import com.isle.feignconsumer.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知", -1);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
