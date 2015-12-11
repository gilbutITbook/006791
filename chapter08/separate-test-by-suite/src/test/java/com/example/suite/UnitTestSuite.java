package com.example.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.ArgumentParserUT;
import com.example.calc.internal.SimpleScoreCalculatorImplInnerUT;
import com.example.calc.internal.SimpleScoreCalculatorImplUT;
import com.example.payment.PaymentMethodUT;
import com.example.payment.PaymentReceiptUT;

@RunWith(Suite.class)
@SuiteClasses( { ArgumentParserUT.class, 
	SimpleScoreCalculatorImplUT.class, 
	SimpleScoreCalculatorImplInnerUT.class,
	PaymentMethodUT.class,
	PaymentReceiptUT.class})
public class UnitTestSuite {

}
