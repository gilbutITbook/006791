package com.example.bean;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ExampleBeanTest {

	private ExampleBean sut;
	
	@Before
	public void setUp() {
		sut = new ExampleBean();
		sut.setName("foo");
		sut.setValue("bar");
	}
	
	@Test
	public void when_name_of_bean_is_foo_then_getName_is_foo() {
		assertThat(sut.getName(), is("foo"));
	}
	
	@Test
	public void when_value_of_bean_is_bar_then_getValue_is_bar() {
		assertThat(sut.getValue(), is("bar"));
	}
}
