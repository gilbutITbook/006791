package com.example.integration;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.example.ArgumentParser;
import com.example.Parameter;
import com.example.calc.internal.SimpleScoreCalculatorImpl;

public class CalculateWithParameterIT {
	
	@Test
	public void when_tanyao_50_then_score_is_1600() {
		String[] args = {"タンヤオ", "50"};
		Parameter p = new ArgumentParser().parse(args);
		
		int score = new SimpleScoreCalculatorImpl().calculate(
				p.code, p.hansu, p.tsumo, p.peace);
		assertThat(score, is(1600));
	}
	
	@Test
	public void when_men_tan_pin_30_then_score_is_3900() {
		String[] args = {"メン", "タン", "ピン", "30"};
		Parameter p = new ArgumentParser().parse(args);

		int score = new SimpleScoreCalculatorImpl().calculate(
				p.code, p.hansu, p.tsumo, p.peace);
		assertThat(score, is(3900));
	}
	
	@Test
	public void when_pinfu_tsumo_20_then_score_is_1300() {
		String[] args = {"ピンフ", "ツモ", "20"};
		Parameter p = new ArgumentParser().parse(args);

		int score = new SimpleScoreCalculatorImpl().calculate(
				p.code, p.hansu, p.tsumo, p.peace);
		assertThat(score, is(1300));
	}
}
