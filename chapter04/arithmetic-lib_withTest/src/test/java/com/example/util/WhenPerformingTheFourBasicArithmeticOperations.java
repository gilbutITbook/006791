package com.example.util;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class WhenPerformingTheFourBasicArithmeticOperations {

  public static class InAddition{
    @Test
    public void shouldReturnTheSumOfNumbersWhichAreNumericString() {
      assertEquals(new BigDecimal(2), BasicArithmeticOperations.plus("1", "1"));
    }

    @Test
    public void shouldReturnTheSumOfNumbersWhichAreBigDecimal() {
      assertEquals(new BigDecimal(2), BasicArithmeticOperations.plus(BigDecimal.ONE, BigDecimal.ONE));
    }
  }

  public static class InSubtraction{
    @Test
    public void shouldReturnTheDifferenceOfNumbersWhichAreNumericString() {
      assertEquals(BigDecimal.ZERO, BasicArithmeticOperations.minus("1", "1"));
    }

    @Test
    public void shouldReturnTheDifferenceOfNumbersWhichAreBigDecimal() {
      assertEquals(BigDecimal.ZERO, BasicArithmeticOperations.minus(BigDecimal.ONE, BigDecimal.ONE));
    }
  }

  public static class InMultiplication{
    @Test
    public void shouldReturnTheProductOfNumbersWhichAreNumericString() {
      assertEquals(BigDecimal.ONE, BasicArithmeticOperations.multiply("1", "1"));
    }

    @Test
    public void shouldReturnTheProductOfNumbersWhichAreBigDecimal() {
      assertEquals(BigDecimal.ONE, BasicArithmeticOperations.multiply(BigDecimal.ONE, BigDecimal.ONE));
    }
  }

  public static class InDivision{
    @Test
    public void shouldReturnTheQuotientOfNumbersWhichAreNumericString() {
      assertEquals(BigDecimal.ONE, BasicArithmeticOperations.divide("1", "1"));
    }

    @Test
    public void shouldReturnTheQuotientOfNumbersWhichAreBigDecimal() {
      assertEquals(BigDecimal.ONE, BasicArithmeticOperations.divide(BigDecimal.ONE, BigDecimal.ONE));
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDivisorIsZero() {
      BasicArithmeticOperations.divide(BigDecimal.ONE, BigDecimal.ZERO);
    }
  }

}
