package com.example.custom.annotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class CustomAnnotationApplication implements CommandLineRunner{
	
	private LogService logService;

	public CustomAnnotationApplication(LogService logService) {
		super();
		this.logService = logService;
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("main class - starting!");
		logService.logMessage();
		
	}

}
