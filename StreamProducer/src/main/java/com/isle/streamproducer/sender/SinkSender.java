package com.isle.streamproducer.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

//@EnableBinding(SinkSender.SinkOutput.class)
public class SinkSender {

    private static final Logger LOGGER = LoggerFactory.getLogger(SinkSender.class);

    //@Bean
    //@InboundChannelAdapter(value = Sink.INPUT, poller = @Poller(fixedDelay = "1000"))
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>("{\"name\":\"didi\", \"age\":30}");
    }

    public interface SinkOutput {

        String OUTPUT = "input";

        //@Output(OUTPUT)
        MessageChannel output();

    }

}
