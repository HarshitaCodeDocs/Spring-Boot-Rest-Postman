package com.bookapp.service;

import java.util.List;

import com.bookapp.entity.Book;

public interface BookService {

	Book getById(int bookid);
	List<Book> getBooksByAuthor(String author);
	List<Book> getBooksByCategory(String category);
}
