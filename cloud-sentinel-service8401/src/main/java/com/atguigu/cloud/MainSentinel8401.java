package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MainSentinel8401 {

    public static void main(String[] args) {
        SpringApplication.run(MainSentinel8401.class, args);
    }
}
