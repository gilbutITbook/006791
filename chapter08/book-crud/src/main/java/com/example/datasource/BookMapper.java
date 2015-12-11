package com.example.datasource;

import java.util.List;

import com.example.domain.model.Book;

public interface BookMapper {
    Book findById(Long id);
    List<Book> findAll();
    void register(Book book);
    void update(Book book);
    void delete(Long id);
}
