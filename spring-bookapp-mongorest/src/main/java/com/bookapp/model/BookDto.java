package com.bookapp.model;

public class BookDto {
	private String title;
	private String author;
	private String bookId;
	private double price;
	private String category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookDto() {
		super();
	}

	public String getAuthor() {
		return author;
	}



	public BookDto(String title, String author, String bookId, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
		this.category = category;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + ", price=" + price + ", category="
				+ category + "]";
	}

}
