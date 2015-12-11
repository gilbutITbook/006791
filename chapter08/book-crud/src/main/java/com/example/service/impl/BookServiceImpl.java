package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.model.Book;
import com.example.domain.repository.BookRepository;
import com.example.service.accessor.BookAccessor;
import com.example.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    
    @Override
    public void register(BookAccessor book) {
    	Book newBook = bookRepository.create(book.getTitle(), book.getIsbn());
        bookRepository.register(newBook);
    }

    @Override
    public void update(BookAccessor book) {
    	Book currentBook = bookRepository.findById(Long.parseLong(book.getId()));
    	currentBook.setTitle(book.getTitle());
        bookRepository.update(currentBook);
    }

    @Override
    public void delete(Long id) {
        bookRepository.delete(id);
    }
}
