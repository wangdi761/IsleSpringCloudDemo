package com.isle.trace2.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TraceController.class);

    @GetMapping("/trace-2")
    public String trace() {
        LOGGER.info("===<call trace-2>===");
        return "Trace";
    }

}
