package com.isle.tracestream2.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TraceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TraceController.class);

    @GetMapping("/trace-2")
    public String trace(HttpServletRequest request) {
        LOGGER.info("===<call trace-2, TraceId = {}, SpanId = {}>===",
            request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
        return "Trace";
    }

}
