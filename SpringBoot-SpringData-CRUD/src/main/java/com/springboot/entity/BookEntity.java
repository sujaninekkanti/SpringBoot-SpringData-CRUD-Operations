package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "BOOK_STORES")
public class BookEntity implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "Book_Id")
	private Integer bookId;

	@Column(name = "Book_Name")
	private String bookName;

	@Column(name = "Book_Price")
	private Long bookPrice;

	@Column(name = "Book_Author")
	private String bookAuthor;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Long getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Long bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor="
				+ bookAuthor + "]";
	}

}
