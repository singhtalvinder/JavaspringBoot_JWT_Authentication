package com.singht.jwtexample1.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername = username :" + username);
		if ("user1".equals(username)) {
			System.out.println("****************returning user***********");
			return new User("user1", 
					"$2a$10$a0C2uC8nqqeziN1bH9NAYOZmHfUZURwqH8YDG0SlhrVvcXDr1NQue",
					//"$2b$10$2XkNX5rRQ2nGYAyT5AZngu1KdMpQ3C3EZPsi.c94Hze.QP59AKUTu",
					        new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}