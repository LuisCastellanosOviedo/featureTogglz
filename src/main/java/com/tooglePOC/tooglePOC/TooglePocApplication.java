package com.tooglePOC.tooglePOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TooglePocApplication {

	public static void main(String[] args) {
		SpringApplication.run(TooglePocApplication.class, args);
	}
}
