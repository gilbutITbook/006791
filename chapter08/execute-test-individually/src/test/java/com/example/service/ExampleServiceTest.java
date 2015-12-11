package com.example.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.example.model.ExampleModel;
import com.example.suite.categories.SlowTests;

public class ExampleServiceTest {

	private ExampleService sut = new ExampleService();
	
	@Test
	public void testQuickly() {
		ExampleModel actualModel = sut.findById(1L);
		assertThat(actualModel.getName(), is("name1"));
	}
	
	@Test
	@Category(SlowTests.class)
	public void testSlowly() {
		ExampleModel actualModel = sut.findWithComplexCondition();
		assertThat(actualModel.getName(), is("name5000"));
	}
}
