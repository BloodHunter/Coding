package com.wbl.api.framework.filter.request;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import com.sun.jersey.spi.container.ResourceFilter;

import javax.ws.rs.ext.Provider;

/**
 * Created by wbl on 16/12/26.
 */
public class ParameterValidatorResourceFilter implements ResourceFilter, ContainerRequestFilter{

    @Override
    public ContainerRequestFilter getRequestFilter() {
        return this;
    }

    @Override
    public ContainerResponseFilter getResponseFilter() {
        return null;
    }

    @Override
    public ContainerRequest filter(ContainerRequest containerRequest) {
        System.out.println("ParameterValidatorResourceFilter");
        return containerRequest;
    }

}
