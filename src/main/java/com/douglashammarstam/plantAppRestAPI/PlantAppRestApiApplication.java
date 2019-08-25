package com.douglashammarstam.plantAppRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@EnableJpaRepositories("com.douglashammarstam.plantAppRestAPI.*")
@ComponentScan(basePackages = { "com.douglashammarstam.plantAppRestAPI.*" })
@EntityScan("com.douglashammarstam.plantAppRestAPI.*")
@SpringBootApplication
public class PlantAppRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlantAppRestApiApplication.class, args);
    }

}
