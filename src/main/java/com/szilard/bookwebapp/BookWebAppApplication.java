package com.szilard.bookwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.szilard.bookwebapp.repository")
@EntityScan("com.szilard.bookwebapp.model")
@SpringBootApplication
public class BookWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookWebAppApplication.class, args);
    }

}
