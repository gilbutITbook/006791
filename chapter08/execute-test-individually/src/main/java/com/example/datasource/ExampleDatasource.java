package com.example.datasource;

import com.example.model.ExampleModel;

public class ExampleDatasource extends AbstractDatasource<ExampleModel> {
	
	@Override
	ExampleModel createModel(Long id) {
		ExampleModel model = new ExampleModel();
		model.setId(id);
		model.setName("name" + id);
		model.setValue("value" + id);
		return model;
	}
}
