package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	public void setDetails(BookDetails details) {
		this.details = details;
	}

	private BookDetails details;

	@Override
	public List<Book> getAll() {
		return details.showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> books = details.showBookList();
		List<Book> booksByAuthor = new ArrayList<>();

		// Iterate through the books list
		for (Book book : books) {
			// if author name is same
			if (book.getAuthor().equals(author)) {
				// add to the new list
				booksByAuthor.add(book);
			}
		}
		// throw exception if list is empty
		if (booksByAuthor.isEmpty())
			throw new BookNotFoundException("author not ailable");
		return booksByAuthor;
	}

	@Override
	public Book getById(int bookid) throws BookNotFoundException {
		List<Book> books = details.showBookList();
		Book matchingBook=null;
		for (Book book : books) {
			if(book.getBookId()==bookid)
				matchingBook=book;
		}
		if (matchingBook == null)
            throw new BookNotFoundException("book not found");
		return matchingBook;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = details.showBookList();
		List<Book> booksByCategory = new ArrayList<>();

		// Iterate through the books list
		for (Book book : books) {
			// if category name is same
			if (book.getCategory().equals(category)) {
				// add to the new list
				booksByCategory.add(book);
			}
		}
		// throw exception if list is empty
		if (booksByCategory.isEmpty())
			throw new BookNotFoundException("category not ailable");
		return booksByCategory;
	}

}
