package com.example.web

import geb.spock.GebReportingSpec

import com.example.web.page.ListPage

class BookListSpec extends GebReportingSpec {
	
	def "리스트 화면이 표시된다" () {
		when:
		go 'http:localhost:8080/book-crud/'
		
		then:
		at ListPage
	}
}
