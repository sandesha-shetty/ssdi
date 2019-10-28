package com.ssdi.bookshare.service;

import com.ssdi.bookshare.model.Book;
import com.ssdi.bookshare.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> listAll(){
        return bookRepository.findAll();
    }

    public void save(Book book){
        bookRepository.save(book);
    }

    public Book get(Integer id){
        return bookRepository.findById(id).get();
    }

    public void delete(Integer id){
        bookRepository.deleteById(id);
    }
}
