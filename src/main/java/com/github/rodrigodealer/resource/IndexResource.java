package com.github.rodrigodealer.resource;

import java.util.Arrays;
import java.util.List;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.rodrigodealer.model.User;
import com.yammer.metrics.annotation.Timed;
 
@Path("/")
public class IndexResource {
 
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Timed
    public List<User> index() {
        return Arrays.asList(new User("Rodrigo"));
    }
}