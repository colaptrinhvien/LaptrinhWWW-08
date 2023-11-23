package com.fit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.BookDAO;
import com.fit.entity.Book;

@Service
public class BookServiceImlp implements BookService {
	
	@Autowired
	private BookDAO bookDAO;

	@Override
	public List<Book> getAllBook() {
		return bookDAO.getAllBook();
	}

	@Override
	public boolean updateBook(Book b) {
		return bookDAO.updateBook(b);
	}

	@Override
	public boolean deleteBook(Book b) {
		return bookDAO.deleteBook(b);
	}

	@Override
	public boolean insertBook(Book b) {
		return bookDAO.insertBook(b);
	}

	@Override
	public Book getBookByID(int id) {
		return bookDAO.getByID(id);
	}
	
}
