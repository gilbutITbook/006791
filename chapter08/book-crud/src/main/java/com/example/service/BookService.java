package com.example.service;

import com.example.service.accessor.BookAccessor;

public interface BookService {
	void register(BookAccessor book);
	void update(BookAccessor book);
	void delete(Long id);
}
