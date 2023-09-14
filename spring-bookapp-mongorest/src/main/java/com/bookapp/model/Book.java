package com.bookapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document//for mongo it is Document
public class Book {
	private String title;
	private String author;
	@Id 
	private String bookId;
	@Field(name="price")
	private double price;
	private String category;
	
	private String[] types;
	
	
	public Book() {
		super();
	}
	public Book(String title, String author, String bookId, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
