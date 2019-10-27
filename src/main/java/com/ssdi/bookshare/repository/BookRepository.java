package com.ssdi.bookshare.repository;

import com.ssdi.bookshare.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByUserId(Integer userId);
    Optional<Book> findByIdAndUserId(Integer id,Integer userId);
}
