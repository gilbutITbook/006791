package com.example.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleBean {
	
	private static Logger log = LoggerFactory.getLogger(ExampleBean.class);

	private String name;
	private String value;

	public ExampleBean() {
		log.info("create ProperBean");
	}
	
	public String getName() {
		log.debug("call getName(): " + name);
		return name;
	}
	public void setName(String name) {
		log.debug("setName: " + name);
		this.name = name;
	}
	public String getValue() {
		log.debug("call getValue(): " + value);
		return value;
	}
	public void setValue(String value) {
		log.debug("setName: " + value);
		this.value = value;
	}
}
