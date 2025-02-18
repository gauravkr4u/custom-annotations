package com.example.custom.annotation;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LogService {
	
	@LogHelloWorld
	public void logMessage() {
		log.info("Service Class - method executed.");
	}

}
