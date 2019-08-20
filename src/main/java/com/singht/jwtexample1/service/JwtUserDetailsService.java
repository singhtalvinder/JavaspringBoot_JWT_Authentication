package com.singht.jwtexample1.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.singht.jwtexample1.dao.UserDao;
import com.singht.jwtexample1.model.DAOUser;
import com.singht.jwtexample1.model.UserDTO;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername = username :" + username);
		
		DAOUser user = userDao.findByUsername(username);
		
		if(username == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return new org.springframework.security.core.userdetails.User(
															user.getUsername(), 
															user.getPassword(),
															new ArrayList<>());
//		if ("user1".equals(username)) {
//			System.out.println("****************returning user***********");
//			return new User("user1", 
//					"$2a$10$a0C2uC8nqqeziN1bH9NAYOZmHfUZURwqH8YDG0SlhrVvcXDr1NQue",
//					//"$2b$10$2XkNX5rRQ2nGYAyT5AZngu1KdMpQ3C3EZPsi.c94Hze.QP59AKUTu",
//					new ArrayList<>());
//		} else {
//			throw new UsernameNotFoundException("User not found with username: " + username);
//		}
	}
	
	// Save user.
	public DAOUser save(UserDTO user) {
		DAOUser newUser = new DAOUser();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userDao.save(newUser);
	}
}