package com.example.util;

import java.math.BigDecimal;

/**
 * 高精度の四則演算を行うライブラリです。
 * <p>
 * {@link java.lang.String}または{@link java.math.BigDecimal}で表現された数の加減乗除を行います。
 * {@link java.lang.String}の場合は{@link java.math.BigDecimal}に変換してから演算します。
 * </p>
 * @author Gradle徹底入門
 * @version 0.1
 */
public class BasicArithmeticOperations {

  /**
   * {@link java.lang.String}で表現された数値同士を加算します。
   *
   * @param a {@link java.lang.String}で表現された数値
   * @param b {@link java.lang.String}で表現された数値
   * @return 2つの引数の和
   * @throws java.lang.NumberFormatException 文字列が解析可能な整数型を含まない場合
   */
  static public BigDecimal plus(String a, String b) {
    return plus(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}型の数値同士を加算します。
   *
   * @param a {@link java.math.BigDecimal}型の数値
   * @param b {@link java.math.BigDecimal}型の数値
   * @return 2つの引数の和
   */
  static public BigDecimal plus(BigDecimal a, BigDecimal b) {
    return a.add(b);
  }

  /**
   * {@link java.lang.String}で表現された数値同士を減算します。
   *
   * @param a {@link java.lang.String}で表現された数値
   * @param b {@link java.lang.String}で表現された数値
   * @return 2つの引数の差
   * @throws java.lang.NumberFormatException 文字列が解析可能な整数型を含まない場合
   */
  static public BigDecimal minus(String a, String b) {
    return minus(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}型の数値同士を減算します。
   *
   * @param a {@link java.math.BigDecimal}型の数値
   * @param b {@link java.math.BigDecimal}型の数値
   * @return 2つの引数の差
   */
  static public BigDecimal minus(BigDecimal a, BigDecimal b) {
    return a.subtract(b);
  }

  /**
   * {@link java.lang.String}で表現された数値同士を乗算します。
   *
   * @param a {@link java.lang.String}で表現された数値
   * @param b {@link java.lang.String}で表現された数値
   * @return 2つの引数の積
   * @throws java.lang.NumberFormatException 文字列が解析可能な整数型を含まない場合
   */
  static public BigDecimal multiply(String a, String b) {
    return multiply(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}型の数値同士を乗算します。
   *
   * @param a {@link java.math.BigDecimal}型の数値
   * @param b {@link java.math.BigDecimal}型の数値
   * @return 2つの引数の積
   */
  static public BigDecimal multiply(BigDecimal a, BigDecimal b) {
    return a.multiply(b);
  }

  /**
   * {@link java.lang.String}で表現された数値同士を除算します。
   *
   * @param a {@link java.lang.String}で表現された数値
   * @param b {@link java.lang.String}で表現された数値
   * @return 2つの引数の商
   * @throws java.lang.NumberFormatException 文字列が解析可能な整数型を含まない場合
   * @throws java.lang.ArithmeticException b==0 である場合
   */
  static public BigDecimal divide(String a, String b) {
    return divide(new BigDecimal(a), new BigDecimal(b));
  }

  /**
   * {@link java.math.BigDecimal}型の数値同士を除算します。
   *
   * @param a {@link java.math.BigDecimal}型の数値
   * @param b {@link java.math.BigDecimal}型の数値
   * @return 2つの引数の商
   * @throws java.lang.ArithmeticException b==0である場合
   */
  static public BigDecimal divide(BigDecimal a, BigDecimal b) {
    return a.divide(b);
  }

}
