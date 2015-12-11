package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.model.Book;
import com.example.domain.repository.BookRepository;
import com.example.service.BookFinderService;

@Service
@Transactional
public class BookFinderServiceImpl implements BookFinderService {

    @Autowired
    private BookRepository bookRepository;
 
    @Override   
    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
}
