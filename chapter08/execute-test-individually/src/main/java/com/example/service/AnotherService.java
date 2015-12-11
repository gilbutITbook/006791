package com.example.service;

import java.util.List;

import com.example.datasource.AnotherDatasource;
import com.example.datasource.Condition;
import com.example.model.AnotherModel;

public class AnotherService {

	private AnotherDatasource anotherDatasource = new AnotherDatasource();
	
	public List<AnotherModel> findAll() {
		return anotherDatasource.findAll();
	}
	
	public AnotherModel findById(Long id) {
		return anotherDatasource.findById(id);
	}
	
	public AnotherModel findWithComplexCondition() {
		Condition condition = new Condition();
		condition.setId(10000L);
		condition.setSomething("select condition");
		return anotherDatasource.findWithComplexCondition(condition);
	}
}
