package com.example.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.example.model.AnotherModel;
import com.example.suite.categories.SlowTests;

public class AnotherServiceTest {

	private AnotherService sut = new AnotherService();
	
	@Test
	public void testQuickly() {
		AnotherModel actualModel = sut.findById(1L);
		assertThat(actualModel.getName(), is("name1"));
	}
	
	@Test
	@Category(SlowTests.class)
	public void testSlowly() {
		AnotherModel actualModel = sut.findWithComplexCondition();
		assertThat(actualModel.getName(), is("name10000"));
	}
}
