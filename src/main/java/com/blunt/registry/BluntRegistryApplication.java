package com.blunt.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class BluntRegistryApplication {

  public static final Logger LOGGER = LoggerFactory.getLogger(BluntRegistryApplication.class);

  public static void main(String[] args) {
    LOGGER.info("in RegistryMain");
    SpringApplication.run(BluntRegistryApplication.class, args);
  }

}
