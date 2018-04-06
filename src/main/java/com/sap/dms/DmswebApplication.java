package com.sap.dms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DmswebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmswebApplication.class, args);
	}
}
