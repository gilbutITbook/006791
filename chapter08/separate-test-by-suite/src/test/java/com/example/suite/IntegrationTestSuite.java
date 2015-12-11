package com.example.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.integration.CalculateWithParameterIT;

@RunWith(Suite.class)
@SuiteClasses( { CalculateWithParameterIT.class })
public class IntegrationTestSuite {

}
