package com.loggingexample.springboot;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
		logger.debug("Debug Logger");
		logger.warn("Warn Logger");
		logger.info("info Logger");
	}
}
