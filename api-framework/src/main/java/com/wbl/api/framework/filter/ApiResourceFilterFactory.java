package com.wbl.api.framework.filter;

import com.sun.jersey.api.model.AbstractMethod;
import com.sun.jersey.spi.container.ResourceFilter;
import com.sun.jersey.spi.container.ResourceFilterFactory;
import com.wbl.api.framework.filter.request.ParameterValidatorResourceFilter;
import com.wbl.api.framework.filter.response.ResponseTestFilter;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wbl on 16/12/27.
 */
public class ApiResourceFilterFactory implements ResourceFilterFactory {
    @Override
    public List<ResourceFilter> create(AbstractMethod am) {
        List<ResourceFilter> filters = new ArrayList<>();
        if (am.isAnnotationPresent(Path.class)){
            System.out.println(am.getResource().getPath());
        }
        filters.add(new ParameterValidatorResourceFilter());
        filters.add(new ResponseTestFilter());

        return filters;
    }
}
