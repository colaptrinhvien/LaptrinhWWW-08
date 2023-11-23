package com.fit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String author;
	private String category;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category + ", quantity="
				+ quantity + "]";
	}
	public Book(int id, String title, String author, String category, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.quantity = quantity;
	}
	public Book(int id) {
		super();
		this.id = id;
	}
	public Book(String title, String author, String category, int quantity) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.quantity = quantity;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
