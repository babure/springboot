package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.model.BookDto;

public interface IBookService {
	void addBook(BookDto bookDto);
	void updateBook(BookDto bookDto);
	BookDto getById(int bookId) throws BookNotFoundException;
	void deleteBook(int bookId);
	List<BookDto> getAll();
	List<BookDto> getByAuthor(String author) throws BookNotFoundException;
	Book BookDto(int bookid) throws BookNotFoundException;
	List<BookDto> getByCategory(String category) throws BookNotFoundException;
}
