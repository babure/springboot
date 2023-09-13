package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
	List<Book> getAll();
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	Book getById(int bookid) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;
}
