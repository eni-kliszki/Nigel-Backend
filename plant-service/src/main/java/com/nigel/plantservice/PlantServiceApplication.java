package com.nigel.plantservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlantServiceApplication.class, args);
    }

}
