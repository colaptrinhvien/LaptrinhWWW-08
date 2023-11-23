package com.fit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fit.entity.Book;

@Repository
public class BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Book> getAllBook() {
		Session session = sessionFactory.getCurrentSession();
		List<Book> books = session.createQuery("from Book", Book.class).list();
		return books;
	}
	
	@Transactional
	public boolean updateBook(Book b) {
		Session session = sessionFactory.getCurrentSession();
		session.update(b);
		return true;
	}
	
	@Transactional
	public boolean deleteBook(Book b) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(b);
		return true;
	}
	
	@Transactional
	public boolean insertBook(Book b) {
		Session session = sessionFactory.getCurrentSession();
		session.save(b);
		return true;
	}
	
	@Transactional
	public Book getByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Book b = session.createQuery("from Book where id = " + id, Book.class).uniqueResult();
		return b;
	}
}
