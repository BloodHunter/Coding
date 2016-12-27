package com.wbl.web.application.view;

import com.wbl.api.framework.annotations.ParamDesc;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by wbl on 16/12/26.
 */
@Path("myresource")
public class JerseyTest {

    @Path("test1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String testPath1(@ParamDesc(isRequired = true,desc = "request filter test")@QueryParam("name")String name, @QueryParam("age")int age){
        System.out.println("request filter");
        return name + ":" + age;
    }

    @Path("test2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String testPath2(@ParamDesc(isRequired = true,desc = "response filter test")@QueryParam("name")String name,@QueryParam("age")int age){
        System.out.println("response filter");
        return name + ":" + age;
    }

}
