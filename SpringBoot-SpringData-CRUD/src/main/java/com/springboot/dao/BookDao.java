package com.springboot.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.BookEntity;

@Repository("bookDao")
public interface BookDao extends JpaRepository<BookEntity, Serializable>{

	List<BookEntity> findByBookId(Integer bookId);

}
