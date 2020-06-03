package com.example.crudEx1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.crudEx1.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {
	
	
}
