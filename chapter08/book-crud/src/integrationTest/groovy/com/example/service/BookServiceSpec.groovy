package com.example.service


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.transaction.annotation.Transactional

import com.example.domain.model.Book
import com.example.service.accessor.BookAccessor

import spock.lang.Specification

@Transactional
@ContextConfiguration(locations = "classpath:ac-test.xml")
public class BookServiceSpec extends Specification {
	
    @Autowired
    private BookService service;
    @Autowired
    private BookFinderService finderService;
    
    def "書籍を登録できること" () {
		given:
		BookTestInfo book = new BookTestInfo(title:'Gradle徹底入門', isbn:'9784798199999')
		
		when:
		service.register(book)
		
		then:
		finderService.findById(4L).getTitle() == 'Gradle徹底入門'
    }
	
	def "書籍のタイトルを変更できること" () {
		given:
		Book book = finderService.findById(1L)
		and:
		BookTestInfo updateBook = new BookTestInfo(
			    id:book.getId().toString(), title:book.getTitle())
		when:
		updateBook.setTitle('Grails徹底入門 第2版')
		and:
		service.update(updateBook);
		
		then:
		finderService.findById(1L).getTitle() == 'Grails徹底入門 第2版'
	}
	
	def "書籍を削除できること" () {
		given:
		List<Book> givenBooks = finderService.findAll()
		
		when:
		service.delete(1L)
		
		then:
		finderService.findAll().size() == 2
	}
}

class BookTestInfo implements BookAccessor {	
	String id;
	String title;
	String isbn;
}