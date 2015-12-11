package com.example.bean.sub;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.example.bean.sub.SubBean;

public class SubBeanTest {

	private SubBean testee;
	
	@Before
	public void setUp() {
		testee = new SubBean();
		testee.setName("foo");
		testee.setValue("bar");
	}
	
	@Test
	public void setNameで設定した名前がgetNameで取得できること() {
		assertThat(testee.getName(), is("foo"));
	}
	
	@Test
	public void setValueで設定した値がgetValueで取得できること() {
		assertThat(testee.getValue(), is("bar"));
	}
}
