package com.hcself.hceureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HcEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcEurekaApplication.class, args);
    }

}
