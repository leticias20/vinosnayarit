package com.vinosnayarit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class VinosnayaritApplication {

	public static void main(String[] args) {
		SpringApplication.run(VinosnayaritApplication.class, args);
	}

}
