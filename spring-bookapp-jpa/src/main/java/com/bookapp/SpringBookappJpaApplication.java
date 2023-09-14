package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.BookDto;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJpaApplication.class, args);
	}
	
	@Autowired
	private IBookService iBookService;
	

	@Override
	public void run(String... args) throws Exception {
           BookDto bookDto = new BookDto("Java","Kathy",900,"tech");
           iBookService.addBook(bookDto);
           
           bookDto = new BookDto("Spring","Jhon",1900,"tech");
           iBookService.addBook(bookDto);
           
           iBookService.getAll().forEach(System.out::println);
           System.out.println();
           BookDto newBookDto = iBookService.getById(1);
           System.out.println(newBookDto);
           
           //updating
           newBookDto.setPrice(200);
           newBookDto.setAuthor("kethy siera");
           iBookService.updateBook(newBookDto);
           
           iBookService.getByAuthor("Jhon").forEach(System.out::println);
           
           iBookService.getByAuthPrice("Jhon", 200);
           
           iBookService.getByAuthAndPrice("Jhon", 200);
	}

}
