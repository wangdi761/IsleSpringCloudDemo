package com.isle.tracestream1.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TraceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TraceController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/trace-1")
    public String trace() {
        LOGGER.info("===call trace-1===");
        return restTemplate.getForEntity("http://trace-2/trace-2", String.class).getBody();
    }

}
