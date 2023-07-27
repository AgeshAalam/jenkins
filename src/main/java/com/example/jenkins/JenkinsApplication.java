package com.example.jenkins;


import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication {
    public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsApplication.class);
	@PostConstruct
	void init(){
		logger.info("application started");
	}

    public static void main(String[] args) {
		logger.info("application executed");
        SpringApplication.run(JenkinsApplication.class, args);

    }
}
