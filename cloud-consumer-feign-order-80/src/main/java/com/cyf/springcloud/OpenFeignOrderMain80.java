package com.cyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author by cyf
 * @date 2020/7/5.
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignOrderMain80.class,args);
    }
}
