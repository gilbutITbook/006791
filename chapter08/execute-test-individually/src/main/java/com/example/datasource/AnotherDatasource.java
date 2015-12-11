package com.example.datasource;

import com.example.model.AnotherModel;

public class AnotherDatasource extends AbstractDatasource<AnotherModel> {

	@Override
	AnotherModel createModel(Long id) {
		AnotherModel model = new AnotherModel();
		model.setId(id);
		model.setName("name" + id);
		model.setValue("value" + id);
		return model;
	}
}
