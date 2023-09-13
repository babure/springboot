package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}
     @Autowired
	 private IBookService iBookService; 
	 
	@Override
	public void run(String... args) throws Exception {
		iBookService.getByAuthor("Kathy").forEach(book->System.out.println(book));
		iBookService.getByCategory("Tech").forEach(System.out::println);
		Book book = iBookService.getById(1);
		System.out.println(book);		
	}

}
