package com.bookapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.model.BookDto;
import com.bookapp.model.BookMapper;
import com.bookapp.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookRepository iBookRepository;
	
	@Autowired
	private BookMapper bookMapper;

	@Override
	public void addBook(BookDto bookDto) {
        iBookRepository.save(bookMapper.convertToEntity(bookDto));		
	}

	@Override
	public void updateBook(BookDto bookDto) {
        iBookRepository.save(bookMapper.convertToEntity(bookDto));		
	}

	@Override
	public BookDto getById(int bookId) {
		Optional<Book> bookOpt =  iBookRepository.findById(bookId);
		BookDto bookDto = null;
//		if (bookOpt.isPresent()) {
//			bookDto=bookMapper.convertToDto(bookOpt.get());
//		}
		Book book=bookOpt.orElseThrow(()->new BookNotFoundException("book with this id not found"));
	    bookDto=bookMapper.convertToDto(book);
		return bookDto;
	}

	@Override
	public void deleteBook(int bookId) {
		iBookRepository.deleteById(bookId);
	}

	@Override
	public List<BookDto> getAll() {
		List<BookDto> bookDtoList = iBookRepository.findAll().stream().map(books->bookMapper.convertToDto(books)).collect(Collectors.toList());
		return bookDtoList;
	}

	@Override
	public List<BookDto> getByAuthor(String author) throws BookNotFoundException {
		List<BookDto> bookDtoList = iBookRepository.findByAuthor(author).stream().map(books->bookMapper.convertToDto(books)).collect(Collectors.toList());
		return bookDtoList;
	}

	@Override
	public Book BookDto(int bookid) throws BookNotFoundException {
		return null;
	}

	@Override
	public List<BookDto> getByCategory(String category) throws BookNotFoundException {
		return null;
	}

	@Override
	public List<BookDto> getByAuthPrice(String author, double cost) {
		List<BookDto> books = iBookRepository.findByAutPrice(author, cost).stream().map(book->bookMapper.convertToDto(book)).collect(Collectors.toList());
		return books;
	}

	@Override
	public List<BookDto> getByAuthAndPrice(String author, double cost) {
		List<BookDto> books = iBookRepository.findByAuthAndPrice(author, cost).stream().map(book->bookMapper.convertToDto(book)).collect(Collectors.toList());
		return books;
	}

	
}
