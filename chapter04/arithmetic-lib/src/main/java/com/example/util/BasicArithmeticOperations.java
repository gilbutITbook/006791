package com.example.util;

import java.math.BigDecimal;

/**
 * 높은 정확도의 사칙 연산을 하는 라이브러리
 * <p>
 * {@link java.lang.String} 또는 {@link java.math.BigDecimal}로 표현된 수의 사칙 연산
 * {@link java.lang.String}인 경우는 {@link java.math.BigDecimal}로 변환해서 연산한다.
 * </p>
 * @author Gradle 철저입문
 * @version 0.1
 */
public class BasicArithmeticOperations {

  /**
   * {@link java.lang.String}로 표현된 수치 간 덧셈 연산.
   *
   * @param a {@link java.lang.String}로 표현된 수치
   * @param b {@link java.lang.String}로 표현된 수치
   * @return 두 개 인수의 합
   * @throws java.lang.NumberFormatException 문자열이 해석 가능한 정수형을 포함하지 않는 경우
   */
  static public BigDecimal plus(String a, String b) {
    return plus(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}형 수치 간 덧셈 연산
   *
   * @param a {@link java.math.BigDecimal}형 수치
   * @param b {@link java.math.BigDecimal}형 수치
   * @return 두 개 인수의 합
   */
  static public BigDecimal plus(BigDecimal a, BigDecimal b) {
    return a.add(b);
  }

  /**
   * {@link java.lang.String}로 표현된 수치 간 뺄셈
   *
   * @param a {@link java.lang.String}로 표현된 수치
   * @param b {@link java.lang.String}로 표현된 수치
   * @return 두 개 인수의 차
   * @throws java.lang.NumberFormatException 문자열이 해석 가능한 정수형을 포함하지 않는 경우
   */
  static public BigDecimal minus(String a, String b) {
    return minus(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}형 수치 간 뺄셈
   *
   * @param a {@link java.math.BigDecimal}형 수치
   * @param b {@link java.math.BigDecimal}형 수치
   * @return 두 개 인수의 차
   */
  static public BigDecimal minus(BigDecimal a, BigDecimal b) {
    return a.subtract(b);
  }

  /**
   * {@link java.lang.String}로 표현된 수치 간 곱셈
   *
   * @param a {@link java.lang.String}로 표현된 수치
   * @param b {@link java.lang.String}로 표현된 수치
   * @return 두 개 인수의 곱
   * @throws java.lang.NumberFormatException 문자열이 해석 가능한 정수형을 포함하지 않는 경우
   */
  static public BigDecimal multiply(String a, String b) {
    return multiply(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}형 수치 간 곱셈
   *
   * @param a {@link java.math.BigDecimal}형 수치
   * @param b {@link java.math.BigDecimal}형 수치
   * @return 두 개 인수의 곱
   */
  static public BigDecimal multiply(BigDecimal a, BigDecimal b) {
    return a.multiply(b);
  }

  /**
   * {@link java.lang.String}로 표현된 수치 간 나눗셈
   *
   * @param a {@link java.lang.String}로 표현된 수치
   * @param b {@link java.lang.String}로 표현된 수치
   * @return 두 개 인수의 몫
   * @throws java.lang.NumberFormatException 문자열이 해석 가능한 정수형을 포함하지 않는 경우
   * @throws java.lang.ArithmeticException b==0 인 경우
   */
  static public BigDecimal divide(String a, String b) {
    return divide(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}형 수치 간 나눗셈
   *
   * @param a {@link java.math.BigDecimal}형 수치
   * @param b {@link java.math.BigDecimal}
   * @return 두 개 인수의 몫
   * @throws java.lang.ArithmeticException b==0인 경우
   */
  static public BigDecimal divide(BigDecimal a, BigDecimal b) {
    return a.divide(b);
  }

}
