package com.example.datasource;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.example.model.AnotherModel;
import com.example.suite.categories.SlowTests;

public class AnotherDatasourceTest {

	private AnotherDatasource sut = new AnotherDatasource();
	@Test
	public void testFindById() {
		AnotherModel actualModel = sut.findById(1L);
		assertThat(actualModel.getName(), is("name1"));
	}
	
	@Test
	public void testFindAll() {
		List<AnotherModel> actualList = sut.findAll();
		assertThat(actualList.size(), is(1000));
	}
	
	@Test
	@Category(SlowTests.class)
	public void testFindWithComplexCondition() {
		Condition condition = new Condition();
		condition.setId(10000L);
		AnotherModel actualModel = sut.findWithComplexCondition(condition);
		assertThat(actualModel.getName(), is("name10000"));
	}
}
