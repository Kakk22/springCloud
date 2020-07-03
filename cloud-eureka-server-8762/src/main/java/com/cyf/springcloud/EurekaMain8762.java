package com.cyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author by cyf
 * @date 2020/6/29.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain8762 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain8762.class,args);
    }
}
