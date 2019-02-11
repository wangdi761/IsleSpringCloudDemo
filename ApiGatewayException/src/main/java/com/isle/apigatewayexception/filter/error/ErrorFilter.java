package com.isle.apigatewayexception.filter.error;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

//目前版本不需要这样做
@Deprecated
public class ErrorFilter extends ZuulFilter{

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable throwable = ctx.getThrowable();
        LOGGER.error("this is a ErrorFilter: {}", throwable.getCause().getMessage());
        ctx.set("error.status_code", 1000);
        ctx.set("error.exception", throwable.getCause());
        return null;
    }
}
