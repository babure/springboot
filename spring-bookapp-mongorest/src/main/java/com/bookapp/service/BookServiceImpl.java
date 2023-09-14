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
		iBookRepository.insert(bookMapper.convertToEntity(bookDto));
	}

	@Override
	public void updateBook(BookDto bookDto) {
		iBookRepository.save(bookMapper.convertToEntity(bookDto));
	}

	@Override
	public BookDto getById(String bookId) throws BookNotFoundException {
		return bookMapper.convertToDto(iBookRepository.findById(bookId).get());
	}

	@Override
	public void deleteBook(String bookId) {
		iBookRepository.deleteById(bookId);
	}

	@Override
	public List<BookDto> getAll() {
		List<BookDto> bookDtos = iBookRepository.findAll().stream().map(books->bookMapper.convertToDto(books)).collect(Collectors.toList());
		return bookDtos;
	}

	@Override
	public List<BookDto> getByAuthor(String author) throws BookNotFoundException {
		List<BookDto> bookDtos = iBookRepository.findByAuthor(author).stream().map(books->bookMapper.convertToDto(books)).collect(Collectors.toList());
		return bookDtos;
	}

	@Override
	public Book BookDto(String bookid) throws BookNotFoundException {
		Optional<Book> bookDto = iBookRepository.findById(bookid);
		if(bookDto.isPresent()) {
			return bookDto.get();
		}else {
			throw new BookNotFoundException("book not found for the id");
		}	}

	@Override
	public List<BookDto> getByCategory(String category) throws BookNotFoundException {
		List<BookDto> bookDtos = iBookRepository.findByCategory(category).stream().map(books->bookMapper.convertToDto(books)).collect(Collectors.toList());
		return bookDtos;
	}

	@Override
	public List<BookDto> getByAuthPrice(String author, double cost) {
		List<BookDto> bookDtolist = iBookRepository.findByAuthAndPrice(author, cost).stream().map(books->bookMapper.convertToDto(books)).collect(Collectors.toList());
		return bookDtolist;
	}

	@Override
	public List<BookDto> getByAuthAndPrice(String author, double cost) {
		List<BookDto> bookDtolist = iBookRepository.findByAutPrice(author, cost).stream().map(books->bookMapper.convertToDto(books)).collect(Collectors.toList());
		return bookDtolist;
	}

	

	
}
