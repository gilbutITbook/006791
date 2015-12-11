package com.example.web

import geb.spock.GebReportingSpec

import com.example.web.page.CreatePage

class BookRegistrationSpec extends GebReportingSpec {
	def "등록 화면이 표시된다" () {
		when:
		go 'http:localhost:8080/book-crud/book/createView'
		
		then:
		at CreatePage
	}
}
