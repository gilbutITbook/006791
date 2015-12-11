package com.example.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleBean {
	
	private static Logger log = LoggerFactory.getLogger(ExampleBean.class);

	static {
		log.info("ExampleBean class loaded." );
	}
	private String name;
	private String value;

	public ExampleBean() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		log.debug("setName() - start");
		this.name = name;
		log.debug("setName() - end");
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		log.debug("setValue() - start");
		this.value = value;
		log.debug("setValue() - end");
	}
}
