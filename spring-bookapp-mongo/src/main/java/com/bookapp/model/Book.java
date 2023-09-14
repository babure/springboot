package com.bookapp.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
 

//@Document(collection="newbook")
@Document
public class Book {
	private String title;
	private String author;
	@Id // considered as primary key
	private String bookId;
	@Field(name="cost")
	private double price;
	private String category;
	private String[] bookTypes;
	@DBRef
	private List<Publisher> publishers;
	private Genre genre;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String bookId,String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
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
	public void setBookId(String  bookId) {
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
	public String[] getBookTypes() {
		return bookTypes;
	}
	public void setBookTypes(String[] bookTypes) {
		this.bookTypes = bookTypes;
	}
	public List<Publisher> getPublishers() {
		return publishers;
	}
	
	public void setPublishers(List<Publisher> publishers) {
		this.publishers = publishers;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + ", price=" + price + ", category="
				+ category + ", bookTypes=" + Arrays.toString(bookTypes) + ", publishers=" + publishers + ", genre="
				+ genre + "]";
	}
	

}