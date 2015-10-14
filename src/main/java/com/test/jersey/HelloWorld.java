package com.test.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class HelloWorld {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Hey, This is Jersey JAX-RS !";
    }
    @GET
    @Path("/hellojson")
    @Produces("text/plain")
    public String simplejson() {
        return "hello";
    }
}
