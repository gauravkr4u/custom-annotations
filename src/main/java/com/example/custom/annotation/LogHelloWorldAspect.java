package com.example.custom.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LogHelloWorldAspect {
	
	@After("@annotation(LogHelloWorld)")
	public void logMessage() {
		log.info("Annotation says - Hello World!!");
	}

}
