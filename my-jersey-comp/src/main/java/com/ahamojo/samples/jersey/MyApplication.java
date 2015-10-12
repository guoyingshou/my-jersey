package com.ahamojo.samples.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("test1")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("com.ahamojo.samples.jersey.rest");
    }
}

