package com.cyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain8761 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain8761.class,args);
    }
}
