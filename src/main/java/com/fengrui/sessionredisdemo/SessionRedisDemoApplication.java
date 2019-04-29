package com.fengrui.sessionredisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SessionRedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionRedisDemoApplication.class, args);
    }

}
