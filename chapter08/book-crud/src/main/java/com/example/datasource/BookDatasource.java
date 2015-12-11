package com.example.datasource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.model.Book;
import com.example.domain.repository.BookRepository;

@Repository
public class BookDatasource implements BookRepository {

    @Autowired
    BookMapper bookMapper;
    
    @Override
    public Book findById(Long id) {
        return bookMapper.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Override
    public void register(Book book) {
        bookMapper.register(book);
    }

    @Override
    public void update(Book book) {
        bookMapper.update(book);
    }

    @Override
    public void delete(Long id) {
        bookMapper.delete(id);
    }

    @Override
    public Book create(String title, String isbn) {
        return new Book(title, isbn);
    }
}
