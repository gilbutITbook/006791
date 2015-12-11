package com.example.web.bind;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.model.Book;
import com.example.web.model.BookInfo;

public class BookInfoBinder {
    
    public static BookInfo bind(Book model) {
        
    	BookInfo book = new BookInfo();
        book.setId(model.getId().toString());
        book.setTitle(model.getTitle());
        book.setIsbn(model.getIsbn());
        return book;
    }
    
    public static List<BookInfo> bind(List<Book> list) {
        
        List<BookInfo> bookList = new ArrayList<>();
        for(Book book : list) {
            bookList.add(bind(book));
        }
        return bookList;
    }
}