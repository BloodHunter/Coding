package com.wbl.api.framework.filter.response;

import com.sun.jersey.spi.container.*;

/**
 * Created by wbl on 16/12/27.
 */
public class ResponseTestFilter implements ResourceFilter, ContainerResponseFilter {
    @Override
    public ContainerResponse filter(ContainerRequest request, ContainerResponse response) {
        System.out.println("ResponseTestFilter");
        return response;
    }

    @Override
    public ContainerRequestFilter getRequestFilter() {
        return null;
    }

    @Override
    public ContainerResponseFilter getResponseFilter() {
        return this;
    }
}
