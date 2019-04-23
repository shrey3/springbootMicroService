package com.springbootMicroservice.springbootMicroservice;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("books")
public class Books {
	
		@Id
		private String id;	
		private String bookName;
		private String bookPrice;
		private String bookDescription;

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(String bookPrice) {
			this.bookPrice = bookPrice;
		}
		public String getBookDescription() {
			return bookDescription;
		}
		public void setBookDescription(String bookDescription) {
			this.bookDescription = bookDescription;
		}
		
		public Books(String id, String bookName, String bookPrice, String bookDescription) {
			this.id=id;
			this.bookName = bookName;
			this.bookPrice = bookPrice;
			this.bookDescription=bookDescription;
			
		}
		
		
}
