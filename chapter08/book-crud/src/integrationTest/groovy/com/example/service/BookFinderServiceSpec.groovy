package com.example.service

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.example.domain.model.Book;

import spock.lang.Specification

@ContextConfiguration(locations = "classpath:ac-test.xml")
class BookFinderServiceSpec extends Specification {
	
	@Autowired
	private BookFinderService service
	
	def "IDを指定して書籍が取得できること" () {
		when:
		Book book = service.findById(id)
		
		then:
		book.getTitle() == expectedTitle
		and:
		book.getIsbn() == expectedIsbn
		
		where:
		id	| expectedTitle		| expectedIsbn
		1	| 'Grails徹底入門'	| '9784798117362'
		2	| 'VMware徹底入門'	| '9784798128429'
		3	| 'Hadoop徹底入門'	| '9784798129648'
	}
	
	def "書籍が全件取得できること" () {
		expect:
		service.findAll().size() == 3
	}
}
