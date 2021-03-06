package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@EnableEncrypt
@SpringBootApplication
public class ShiroActionApplication extends  SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	
        return builder.sources(ShiroActionApplication.class);
    }
	
	
    public static void main(String[] args) {
        SpringApplication.run(ShiroActionApplication.class, args);
    }
}