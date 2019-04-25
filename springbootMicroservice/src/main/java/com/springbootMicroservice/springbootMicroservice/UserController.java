package com.springbootMicroservice.springbootMicroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
		
		@Autowired
		private UserRepository userRepository;
		
		@GetMapping("/allusers")
		public List<Users> getAllUsers()
		{
			return userRepository.findAll();
		}
		
		@GetMapping("/getByName/{username}")
		public Users getByName(@PathVariable("username") String username) {
			Users user =  userRepository.findByUsername(username);
			return user;
		}
		
		@PostMapping("/adduser")
		public Users addUser(@RequestBody Users user) {
			System.out.println(user);
			return userRepository.save(user);
			
		}
		
		



}
