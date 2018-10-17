package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.BookDao;
import com.springboot.entity.BookEntity;
import com.springboot.model.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired(required = true)
	private BookDao bookDao;

	@Override
	public boolean insert(Book book) {

		BookEntity entity = new BookEntity();

		entity.setBookName(book.getBookName());
		entity.setBookAuthor(book.getBookAuthor());
		entity.setBookPrice(book.getBookPrice());
		BookEntity bookEntity = bookDao.save(entity);

		return (bookEntity.getBookId() != null) ? true : false;
	}

	@Override
	public List<Book> getAllBooks() {
		List<BookEntity> entities = bookDao.findAll();
		List<Book> books = new ArrayList<Book>();

		if (!entities.isEmpty()) {
			System.out.println("inside service  book test ");

			for (BookEntity entity : entities) {
				Book b = new Book();
				b.setBookId(entity.getBookId());
				b.setBookName(entity.getBookName());
				b.setBookPrice(entity.getBookPrice());
				b.setBookAuthor(entity.getBookAuthor());
				books.add(b);
			}
		}
		return books;
	}

	@Override
	public boolean update(Book book) {

		BookEntity entity = bookDao.findOne(book.getBookId());

		entity.setBookName(book.getBookName());
		entity.setBookPrice(book.getBookPrice());

		BookEntity be = bookDao.save(entity);

		return (be != null) ? true : false;
	}

	@Override
	public boolean delete(Integer bookId) {

		BookEntity entity = bookDao.findOne(bookId);
		bookDao.delete(entity);
		boolean isExists = bookDao.exists(bookId);
		return isExists;
	}

	@Override
	public Book edit(Integer bookId) {
		BookEntity entity = bookDao.findOne(bookId);
		Book book = new Book();
		book.setBookId(entity.getBookId());

		book.setBookName(entity.getBookName());
		book.setBookAuthor(entity.getBookAuthor());
		book.setBookPrice(entity.getBookPrice());

		return book;
	}

}
