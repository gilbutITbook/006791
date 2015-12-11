package com.example.datasource;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.example.model.ExampleModel;
import com.example.suite.categories.SlowTests;

public class ExampleDatasourceTest {

	private ExampleDatasource sut = new ExampleDatasource();
	
	@Test
	public void testFindById() {
		ExampleModel actualModel = sut.findById(1L);
		assertThat(actualModel.getName(), is("name1"));
	}
	
	@Test
	public void testFindAll() {
		List<ExampleModel> actualList = sut.findAll();
		assertThat(actualList.size(), is(1000));
	}
	
	@Test
	@Category(SlowTests.class)
	public void testFindWithComplexCondition() {
		Condition condition = new Condition();
		condition.setId(10000L);
		ExampleModel actualModel = sut.findWithComplexCondition(condition);
		assertThat(actualModel.getName(), is("name10000"));
	}
}
