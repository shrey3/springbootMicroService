package com.springbootMicroservice.springbootMicroservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootMicroservice.springbootMicroservice.Users;

public interface UserRepository extends MongoRepository<Users,String>{

	public List<Users> findAll();
	public Users findByUsername(String username);

}
