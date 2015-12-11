package com.example.service;

import java.util.List;

import com.example.domain.model.Book;

public interface BookFinderService {
    Book findById(Long id);
    List<Book> findAll();
}
