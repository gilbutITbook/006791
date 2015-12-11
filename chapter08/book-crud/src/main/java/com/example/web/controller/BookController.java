package com.example.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.model.Book;
import com.example.service.BookFinderService;
import com.example.service.BookService;
import com.example.web.model.BookInfo;
import com.example.web.bind.BookInfoBinder;

@Controller
public class BookController {
	
    @Autowired
    private BookFinderService bookFindService;
    @Autowired
    private BookService bookService;

    private static final String REDIRECT_DEFAULT_VIEW
            ="redirect:/book/showList";
    
    @RequestMapping(value = "/", method = GET)
    public String init() {
    	return REDIRECT_DEFAULT_VIEW;
    }
    
    @RequestMapping(value = "/book/showList", method = GET)
    public String showList(Model model) {
        List<Book> books = bookFindService.findAll();
        model.addAttribute("bookList", BookInfoBinder.bind(books));
        return "book/list";
    }
    
    @RequestMapping(value = "/book/{bookId}", method = GET)
    public String showBook(@PathVariable long bookId, Model model) {
        Book book = bookFindService.findById(bookId);
        model.addAttribute("book", BookInfoBinder.bind(book));
        return "book/detail";
    }
    
    @RequestMapping(value = "/book/createView", method = GET)
    public String createView(Model model) {
        model.addAttribute("book", new BookInfo());
        return "book/create";
    }
    
    @RequestMapping(value = "/book/register", method = POST)
    public String registerBook(BookInfo bookInfo) {
        bookService.register(bookInfo);
        return REDIRECT_DEFAULT_VIEW;
    }

    @RequestMapping(value = "/book/editView/{bookId}", method = GET)
    public String editView(@PathVariable long bookId, Model model) {
        Book book = bookFindService.findById(bookId);
        model.addAttribute("book", BookInfoBinder.bind(book));
        return "book/edit";
    }
    
    @RequestMapping(value = "/book/update", method = POST)
    public String updateBook(BookInfo bookInfo) {
        bookService.update(bookInfo);
        return "redirect:/book/" + bookInfo.getId();
    }
    
    @RequestMapping(value = "/book/delete/{bookId}", method = POST)
    public String deleteBook(@PathVariable long bookId) {
        bookService.delete(bookId);
        return REDIRECT_DEFAULT_VIEW;
    }
}
