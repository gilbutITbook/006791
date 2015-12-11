package com.example.bean;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Ignore;
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
	public void this_test_will_succeed() {
		assertThat(sut.getName(), is("foo"));
	}
	
	@Test
	public void this_test_will_succeed_too() {
		assertThat(sut.getValue(), is("bar"));
	}

	@Ignore
	@Test
	public void this_test_will_be_skipped() {
		assertThat(sut, is(notNullValue()));
	}
	
	@Test
	public void this_test_will_be_failed() {
		assertThat(sut, is(nullValue()));
	}
}
