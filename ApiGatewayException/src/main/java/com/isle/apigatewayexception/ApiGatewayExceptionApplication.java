package com.isle.apigatewayexception;

import com.isle.apigatewayexception.filter.IsleFilterProcessor;
import com.netflix.zuul.FilterProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayExceptionApplication {

	public static void main(String[] args) {
		//FilterProcessor.setProcessor(new IsleFilterProcessor());
		SpringApplication.run(ApiGatewayExceptionApplication.class, args);
	}

}

