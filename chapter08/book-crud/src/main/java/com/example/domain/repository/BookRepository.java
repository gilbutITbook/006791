package com.example.domain.repository;

import java.util.List;

import com.example.domain.model.Book;

public interface BookRepository {
	Book findById(Long id);
    List<Book> findAll();
    void register(Book book);
    void update(Book book);
    void delete(Long id);
    Book create(String title, String isbn);
}
