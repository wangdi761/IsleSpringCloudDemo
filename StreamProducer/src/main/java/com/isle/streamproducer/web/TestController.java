package com.isle.streamproducer.web;

import com.isle.streamproducer.sender.SinkSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SinkSender sinkSender;

    @GetMapping
    public void test() {
        sinkSender.output().send(MessageBuilder.withPayload("test test").build());
    }

}
