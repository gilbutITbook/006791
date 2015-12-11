package com.example.service;

import java.util.List;

import com.example.datasource.Condition;
import com.example.datasource.ExampleDatasource;
import com.example.model.ExampleModel;

public class ExampleService {

	private ExampleDatasource exampleDatasource = new ExampleDatasource();
	
	public List<ExampleModel> findAll() {
		return exampleDatasource.findAll();
	}
	
	public ExampleModel findById(Long id) {
		return exampleDatasource.findById(id);
	}
	
	public ExampleModel findWithComplexCondition() {
		Condition condition = new Condition();
		condition.setId(5000L);
		condition.setSomething("select condition");
		return exampleDatasource.findWithComplexCondition(condition);
	}
}
