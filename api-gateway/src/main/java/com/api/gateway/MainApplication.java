package com.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication

@EnableEurekaServer
@EnableZuulProxy
public class MainApplication {
	public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
