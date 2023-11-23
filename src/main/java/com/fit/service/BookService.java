package com.fit.service;

import java.util.List;

import com.fit.entity.Book;

public interface BookService {
	public List<Book> getAllBook();
	public boolean updateBook(Book b);
	public boolean deleteBook(Book b);
	public boolean insertBook(Book b);
	public Book getBookByID(int id);
}
