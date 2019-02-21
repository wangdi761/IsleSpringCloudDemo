package com.isle.streamconsumer.receiver;

import com.isle.streamconsumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//@EnableBinding(Sink.class)
public class SinkReceiver3 {

    private static final Logger LOGGER = LoggerFactory.getLogger(SinkReceiver3.class);

    //@StreamListener(Sink.INPUT)
    public void receive(User user) {
        LOGGER.info("Received: {}", user);
    }

}
