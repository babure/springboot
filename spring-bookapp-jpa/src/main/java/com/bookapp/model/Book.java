package com.bookapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Table(name = "tablename")
@Entity//the class will be converted into table 
@NoArgsConstructor
@Data
//@Getter
//@Setter
//@ToString
public class Book {
	private String title;
	private String author;
	@Id //for the primary key
	@GeneratedValue //to generate sequence with the name hibernate_squence
	private Integer bookId;
	@Column(name="price")
	private double price;
	private String category;
	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	

}
