package com.isle.apigatewayexception.filter.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class ThrowExceptionFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThrowExceptionFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        LOGGER.info("This is a pre filter, it will throw a RunTimeException");
        doSomething();
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }
}
