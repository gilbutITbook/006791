package com.example.calc.internal;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.example.calc.Calculator;
import com.example.suite.categories.UnitTests;

@Category(UnitTests.class)
public class SimpleScoreCalculatorImplUT {

    @Test
    public void when_30pu_3han_then_score_is_3900() {
        Calculator sut = new SimpleScoreCalculatorImpl();
        assertThat(sut.calculate(30, 3, false, false), is(3900));
    }

    @Test
    public void when_20pu_4han_then_score_is_5200() {
        Calculator sut = new SimpleScoreCalculatorImpl();
        assertThat(sut.calculate(20, 4, true, true), is(5200));
    }
}
