package com.springboot.service;

import java.util.List;
import com.springboot.model.Book;

public interface BookService {

	public boolean insert(Book book);
	
	public List<Book> getAllBooks();
	
	public boolean update(Book book);
	
	public boolean delete(Integer bookId);
	
	public Book edit(Integer bookId);
	
}
