package com.bookapp.model;

import org.springframework.stereotype.Component;

@Component
public class BookMapper {

	public Book convertToEntity(BookDto bookDto) {
		Book book = new Book();
		book.setAuthor(bookDto.getAuthor());
		book.setBookId(bookDto.getBookId());
		book.setCategory(bookDto.getCategory());
		book.setPrice(bookDto.getPrice());
		book.setTitle(bookDto.getTitle());
		return book;
	}
	
	public BookDto convertToDto(Book book) {
		BookDto bookDto = new BookDto();
		bookDto.setAuthor(book.getAuthor());
		bookDto.setBookId(book.getBookId());
		bookDto.setCategory(book.getCategory());
		bookDto.setPrice(book.getPrice());
		bookDto.setTitle(book.getTitle());
		return bookDto;
	}
}
