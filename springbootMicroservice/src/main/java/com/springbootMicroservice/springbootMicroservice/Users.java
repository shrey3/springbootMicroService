package com.springbootMicroservice.springbootMicroservice;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class Users {
	
		@Id
		private String id;	
		private String username;
		private String password;
		
		//get id
		public String getId() {return id;}
		public void setId(String id) {this.id=id;}
		
		//get username
		public String getUsername() {return username;}
		public void setUsername(String username) {this.username=username;}
		
		//get password
		public String getPassword() {return password;}
		public void setPassword(String password) {this.password=password;}
		
		public Users(String id, String username, String password) {
			this.id=id;
			this.username = username;
			this.password = password;
		}
		
		
}
