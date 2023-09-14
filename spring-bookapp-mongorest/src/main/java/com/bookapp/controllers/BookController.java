package com.bookapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.BookDto;
import com.bookapp.service.IBookService;

@RestController
@RequestMapping("/book-api/v1")
public class BookController {

	private IBookService iBookService;

	public BookController(IBookService iBookService) {
		super();
		this.iBookService = iBookService;
	}

	@PostMapping("/books")
	void addBook(@RequestBody BookDto bookDto) {
         iBookService.addBook(bookDto);
	}

	@PutMapping("/books")
	void updateBook(@RequestBody BookDto bookDto) {
		iBookService.updateBook(bookDto);
	}
	
	@GetMapping("/books/bookId/{bookId}")
	BookDto getById(@PathVariable("bookId") String bookId) throws BookNotFoundException {
		return iBookService.getById(bookId);
	}

	@DeleteMapping("/books/bookId/{bookId}")
	void deleteBook(@PathVariable("bookId") String bookId) {
		iBookService.deleteBook(bookId);
	}

	@GetMapping("/books")
	List<BookDto> getAll() {
		return iBookService.getAll();
	}

	@GetMapping("/books/author/{author}")
	List<BookDto> getByAuthor(@PathVariable("author") String author) throws BookNotFoundException {
		return iBookService.getByAuthor(author);
	}

	@GetMapping("/books/category")
	List<BookDto> getByCategory(@RequestParam("category") String category) throws BookNotFoundException {
		return iBookService.getByCategory(category);
	}

	@GetMapping("books/author/{author}/cost/{cost}")
	List<BookDto> getByAuthPrice(@PathVariable("author") String author, @PathVariable("cost") double cost) {
		return iBookService.getByAuthPrice(author, cost);
	}

	@GetMapping("books/nauthor/{author}/ncost/{ncost}")
	List<BookDto> getByAuthAndPrice(@PathVariable("nauthor") String author, @PathVariable("ncost") double cost) {
		return iBookService.getByAuthAndPrice(author, cost);
	}
}
