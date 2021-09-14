package com.odeivissonsantos.microsservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MicrosservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosservicoApplication.class, args);
	}

}
