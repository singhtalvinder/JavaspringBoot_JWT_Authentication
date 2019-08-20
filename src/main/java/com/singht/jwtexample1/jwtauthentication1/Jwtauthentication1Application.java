package com.singht.jwtexample1.jwtauthentication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.singht.jwtexample1.*")
public class Jwtauthentication1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jwtauthentication1Application.class, args);
	}

}
