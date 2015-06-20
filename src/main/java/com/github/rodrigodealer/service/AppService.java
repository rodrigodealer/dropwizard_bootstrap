package com.github.rodrigodealer.service;

import com.github.rodrigodealer.configuration.AppConfiguration;
import com.github.rodrigodealer.resource.IndexResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
 
public class AppService extends Service<AppConfiguration> {
 
    public static void main(String[] args) throws Exception {
        new AppService().run(new String[] { "server" });
    }
 
    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        bootstrap.setName("blog");
    }
 
    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new IndexResource());
    }
 
}