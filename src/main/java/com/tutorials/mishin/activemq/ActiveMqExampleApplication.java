package com.tutorials.mishin.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActiveMqExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(ActiveMqExampleApplication.class, args);
	}
}
