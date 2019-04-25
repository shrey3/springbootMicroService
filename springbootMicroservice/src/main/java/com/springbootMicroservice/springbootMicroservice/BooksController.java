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
@RequestMapping("/books")
@CrossOrigin
public class BooksController {
		
		@Autowired
		private BooksRepository booksRepository;
		
		@GetMapping("/allbooks")
		public List<Books> getAllBooks()
		{
			return booksRepository.findAll();
		}
		
		@GetMapping("/getbyname/{bookname}")
		public Books getByName(@PathVariable("bookname") String bookName) {
			Books book =  booksRepository.findBybookName(bookName);
			return book;
		}
//		
//		@PostMapping("/adduser")
//		public Users addUser(@RequestBody Users user) {
//			System.out.println(user);
//			return userRepository.save(user);
//			
//		}
//		
		



}
