package com.example.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.example.ArgumentParserUT;
import com.example.calc.internal.SimpleScoreCalculatorImplInnerUT;
import com.example.calc.internal.SimpleScoreCalculatorImplUT;
import com.example.suite.categories.UnitTests;

@RunWith(Categories.class)
@IncludeCategory(UnitTests.class)
@SuiteClasses( { ArgumentParserUT.class, 
	SimpleScoreCalculatorImplUT.class, 
	SimpleScoreCalculatorImplInnerUT.class })
public class UnitTestSuite {

}
