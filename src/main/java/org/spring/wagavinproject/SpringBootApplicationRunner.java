package org.spring.wagavinproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableScheduling
public class SpringBootApplicationRunner extends SpringBootServletInitializer {

    /**
     * Used when run as JAR
     **/
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationRunner.class, args);
    }

    /**
     * Used when run as WAR
     **/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootApplicationRunner.class);
    }


}
