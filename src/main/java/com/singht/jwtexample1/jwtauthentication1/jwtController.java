package com.singht.jwtexample1.jwtauthentication1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jwtController {

	@GetMapping({"/hello"})
	public String firstPage() {
		return "hello world";
	}
}
