package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BackendApplication {
  
    // 푸시 1
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
