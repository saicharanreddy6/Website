package com.example.aboutmewebsite;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement
@ComponentScan({"main.controllers", "main.repositories"})
//@EnableJpaRepositories(basePackages = "com.example.aboutmewebsite.repositories")
//@EntityScan(basePackages = "com.example.aboutmewebsite.entity")
public class AboutMeWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AboutMeWebsiteApplication.class, args);
	}

}
