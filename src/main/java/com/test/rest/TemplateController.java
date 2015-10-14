package com.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("template")
public class TemplateController {

    @GET
    @Path("header")
    @Produces(MediaType.TEXT_HTML)
    public String getHeader(){
        return "<html><head></head><body>hello></body></html>";
    }

    @GET
    @Path("footer")
    @Produces(MediaType.TEXT_HTML)
    public String getFooter(){
        return "<html><head></head><body>hello></body></html>";
    }
}
