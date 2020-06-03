package com.example.crudEx1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudEx1.entity.User;
import com.example.crudEx1.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public  class UserController {
	
	
	private final  UserRepository urepo;
	
	public UserController(UserRepository urepo) {
		this.urepo = urepo;
	}	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		
		return (List<User>) urepo.findAll();
	}
	
	@PostMapping("/users")
	
	public String addUser(@RequestBody User user) {
		urepo.save(user);
		return "User Saved Succesfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public List<User> deleteUser(@PathVariable Long id) {
		urepo.deleteById(id);
		return (List<User>) urepo.findAll();
		
	}
	
	@GetMapping("/finduser/{id}")
	
	public Optional<User> findUser(@PathVariable Long id){
		return urepo.findById(id);
		
	}

}
