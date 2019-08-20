package com.singht.jwtexample1.jwtauthentication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.singht.jwtexample1.*", "com.singht.jwtexample1.dao.*"})
@EntityScan("com.singht.*")
@EnableJpaRepositories("com.singht.jwtexample1.dao")
public class Jwtauthentication1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jwtauthentication1Application.class, args);
	}

}
