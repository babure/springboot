package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookapp.model.Book;

@Component
public class BookDetails {
	public List<Book> showBookList(){
		return Arrays.asList(
				new Book("Java","Kathy",1,200,"Tech"),
				new Book("Leadership","Robin",2,3200,"SelfHelp"),
				new Book("Spring in Action","Kathy",3,800,"Tech"),
				new Book("Secret","Rhonde",4,450,"SelfHelp"),
				new Book("7 Habits","Stephen",5,200,"SelfHelp"),
				new Book("Angular for Dummies","John",6,790,"Tech"));
	}
}
