package com.isle.streamproducer;

import com.isle.streamproducer.sender.SinkSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(SinkSender.class)
@SpringBootApplication
public class StreamProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamProducerApplication.class, args);
	}

}