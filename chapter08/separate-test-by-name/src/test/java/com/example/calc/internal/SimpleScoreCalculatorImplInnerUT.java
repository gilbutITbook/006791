package com.example.calc.internal;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleScoreCalculatorImplInnerUT {

    @Test
    public void when_code_is_20_then_index_is_0() {
    	SimpleScoreCalculatorImpl sut = new SimpleScoreCalculatorImpl();
        assertThat(sut.getIndexOfCode(20), is(0));
    }
    
    @Test
    public void when_code_is_30_then_index_is_1() {
    	SimpleScoreCalculatorImpl sut = new SimpleScoreCalculatorImpl();
        assertThat(sut.getIndexOfCode(30), is(1));
    }
    
    @Test
    public void when_code_is_32_then_index_is_2() {
    	SimpleScoreCalculatorImpl sut = new SimpleScoreCalculatorImpl();
        assertThat(sut.getIndexOfCode(32), is(2));
    }
}
