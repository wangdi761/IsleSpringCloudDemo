package com.isle.streamconsumer.receiver;

import com.alibaba.fastjson.JSON;
import com.isle.streamconsumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;

//@EnableBinding(Sink.class)
public class SinkReceiver2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(SinkReceiver2.class);

    //@ServiceActivator(inputChannel = Sink.INPUT)
    public void receive(User user) {
        LOGGER.info("Received: {}", user);
    }

    //@Transformer(inputChannel = Sink.INPUT, outputChannel = Sink.INPUT)
    public User transform(String message) throws Exception {
        return JSON.parseObject(message, User.class);
    }

}
