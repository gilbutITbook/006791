package com.example.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.example.integration.CalculateWithParameterIT;
import com.example.suite.categories.IntegrationTests;

@RunWith(Categories.class)
@IncludeCategory(IntegrationTests.class)
@SuiteClasses( { CalculateWithParameterIT.class })
public class IntegrationTestSuite {

}
