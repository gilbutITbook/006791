package com.example.bean.sub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubBean {
	
	private static Logger log = LoggerFactory.getLogger(SubBean.class);

	private String name;
	private String value;

	public SubBean() {
		log.info("create PartnerBean");
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
