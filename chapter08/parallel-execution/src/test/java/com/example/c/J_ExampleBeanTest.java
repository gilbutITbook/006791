package com.example.c;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.example.ExampleBean;
import com.example.StressBase;

public class J_ExampleBeanTest extends StressBase {

	private ExampleBean testee = new ExampleBean("testing with stress");
	
	@Before
	public void setUp() {
		stress();
	}
	
	@Test
	public void doSomethingTest_01() {
		testee.setValue("01");
		assertThat(testee.getBeanValue(), is("testing with stress : 01"));
	}
	
	@Test
	public void doSomethingTest_02() {
		testee.setValue("02");
		assertThat(testee.getBeanValue(), is("testing with stress : 02"));
	}
	
	@Test
	public void doSomethingTest_03() {
		testee.setValue("03");
		assertThat(testee.getBeanValue(), is("testing with stress : 03"));
	}
	
	@Test
	public void doSomethingTest_04() {
		testee.setValue("04");
		assertThat(testee.getBeanValue(), is("testing with stress : 04"));
	}
	
	@Test
	public void doSomethingTest_05() {
		testee.setValue("05");
		assertThat(testee.getBeanValue(), is("testing with stress : 05"));
	}
	
	@Test
	public void doSomethingTest_06() {
		testee.setValue("06");
		assertThat(testee.getBeanValue(), is("testing with stress : 06"));
	}
	
	@Test
	public void doSomethingTest_07() {
		testee.setValue("07");
		assertThat(testee.getBeanValue(), is("testing with stress : 07"));
	}
	
	@Test
	public void doSomethingTest_08() {
		testee.setValue("08");
		assertThat(testee.getBeanValue(), is("testing with stress : 08"));
	}
	
	@Test
	public void doSomethingTest_09() {
		testee.setValue("09");
		assertThat(testee.getBeanValue(), is("testing with stress : 09"));
	}
	
	@Test
	public void doSomethingTest_10() {
		testee.setValue("10");
		assertThat(testee.getBeanValue(), is("testing with stress : 10"));
	}
}
