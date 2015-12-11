package com.example.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.bean.ExampleBeanTest;

@RunWith(Suite.class)
@SuiteClasses( { ExampleBeanTest.class })
public class AllTestSuite {

}
