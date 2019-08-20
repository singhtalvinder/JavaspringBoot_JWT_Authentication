package com.singht.jwtexample1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.singht.jwtexample1.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
	// fetch username from db.
	DAOUser findByUsername(String username);
}
