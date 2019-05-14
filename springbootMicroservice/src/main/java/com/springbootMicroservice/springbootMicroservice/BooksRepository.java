package com.springbootMicroservice.springbootMicroservice;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.springbootMicroservice.springbootMicroservice.Books;

@EnableJpaRepositories
public interface BooksRepository extends MongoRepository<Books,String>{
	
	public List<Books> findAll();
	public Books findBybookName(String bookName);

}
