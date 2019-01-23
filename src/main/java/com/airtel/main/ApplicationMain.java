package com.airtel.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class ApplicationMain extends SpringApplicationBuilder {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationMain.class);
	}

	public static void main(String[] args)throws Exception {
		SpringApplication.run(ApplicationMain.class, args);
	}

}
