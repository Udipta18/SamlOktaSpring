package com.example.samlxml.samlxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication
@ImportResource({"classpath:application_config2.xml"})
public class SamlxmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamlxmlApplication.class, args);
		SecurityContextHolder.clearContext();
	}

}
