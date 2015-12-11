package com.example;

public class ExampleBean {
    private final String name;
    private String value;

    public ExampleBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getBeanValue() {
		return name + " : " + value;
	}
}
