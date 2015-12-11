package com.example.web.model;

import com.example.service.accessor.BookAccessor;


public class BookInfo implements BookAccessor {

    private String id;
    private String title;
    private String isbn;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String toString() {
		return "BookInfo [id: " + id + ", title: " + title + ", isbn: " + isbn + "]";
	}
}
