package com.isle.tracestream1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TraceStream1Application {

	public static void main(String[] args) {
		SpringApplication.run(TraceStream1Application.class, args);
	}

}
