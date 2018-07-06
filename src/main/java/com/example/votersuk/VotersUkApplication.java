package com.example.votersuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VotersUkApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotersUkApplication.class, args);
	}
}
