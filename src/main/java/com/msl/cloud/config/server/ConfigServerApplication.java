package com.msl.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        System.out.println("CONFIG SERVER STARTED >>> " + ConfigServerApplication.class.getClassLoader());

        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
