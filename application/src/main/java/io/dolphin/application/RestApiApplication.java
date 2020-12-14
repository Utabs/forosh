package io.dolphin.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "io.dolphin.model")
@EnableJpaRepositories("io.dolphin.business")
//@ComponentScan({"io.dolphin.business"})
//@RestController
 public class RestApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
     }


}
