package com.isle.streamconsumer.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

//@EnableBinding(Sink.class)
public class SinkReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(SinkReceiver.class);

    //@ServiceActivator(inputChannel = Sink.INPUT)
    public void receive(Object payload) {
        LOGGER.info("Received: {}", payload);
    }

}
