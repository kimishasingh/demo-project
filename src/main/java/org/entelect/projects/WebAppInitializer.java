package org.entelect.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("org.entelect.projects")
public class WebAppInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebAppInitializer.class, args);
    }
}
