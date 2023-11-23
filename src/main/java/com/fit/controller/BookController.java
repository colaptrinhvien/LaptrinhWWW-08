package com.fit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fit.entity.Book;
import com.fit.service.BookService;

@Controller
@RequestMapping("/")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		List<Book> books = service.getAllBook();
		ModelAndView model = new ModelAndView("home-page");
		model.addObject("books", books);
		return model;
	}
	
	@RequestMapping("/show-form-update/{id}")
	public ModelAndView showForm(@PathVariable("id") int id) {
		Book b = service.getBookByID(id);
		ModelAndView model = new ModelAndView("form-book");
		model.addObject("book", b);
		return model;
	}
	
	@RequestMapping("/show-form-insert")
	public ModelAndView showForm() {
		ModelAndView model = new ModelAndView("form-book-insert");
		model.addObject("book", new Book());
		return model;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insertBook(@ModelAttribute("book") Book b) {
		service.insertBook(b);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView deleteBook(@PathVariable("id") int id) {
		Book b = new Book(id);
		service.deleteBook(b);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateBook(@ModelAttribute("book") Book b) {
		service.updateBook(b);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
}
