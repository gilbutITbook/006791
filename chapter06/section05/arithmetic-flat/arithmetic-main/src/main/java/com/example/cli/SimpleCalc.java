package com.example.cli;

import com.example.util.BasicArithmeticOperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class SimpleCalc {

  public SimpleCalc() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Input formula: ");
      String input;
      while( (input=br.readLine()) != null ) {
        System.out.println(calc(input));
        System.out.print("Input formula: ");
      }
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private String calc(String fomula) {
    String[] elements = fomula.split(" ");
    if(elements.length != 3) return "Invalid syntax";

    String a = elements[0];
    String b = elements[2];
    String op = elements[1];

    BigDecimal result = null;
    switch (op) {
      case "+":
        result = BasicArithmeticOperations.plus(a,b);
        break;
      case "-":
        result = BasicArithmeticOperations.minus(a, b);
        break;
      case "*":
        result = BasicArithmeticOperations.multiply(a, b);
        break;
      case "/":
        try {
          result = BasicArithmeticOperations.divide(a, b);
        } catch(ArithmeticException e) {
          e.printStackTrace();
        }
        break;
    }
    return (result==null) ? "NaN" : result.toString();
  }

  public static void main(String... args) {
    new SimpleCalc();
  }
}
