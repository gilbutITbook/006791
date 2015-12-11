package com.example;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.example.ArgumentParser;
import com.example.suite.categories.UnitTests;

@Category(UnitTests.class)
public class ArgumentParserUT {
	
	@Test
	public void when_men_tan_pin_30_then_peace_is_true_and_hansu_is_3_and_code_is_30() {
		String[] args = {"メン", "タン", "ピン", "30"};
		Parameter p = new ArgumentParser().parse(args);
		assertThat(p.peace, is(true));
		assertThat(p.hansu, is(3));
		assertThat(p.code, is(30));
	}

	@Test
	public void when_pinfu_tsumo_20_then_peace_and_tsumo_is_true_and_hansu_is_2_and_code_is_30() {
		String[] args = {"ピンフ", "ツモ", "20"};
		Parameter p = new ArgumentParser().parse(args);
		assertThat(p.peace, is(true));
		assertThat(p.tsumo, is(true));
		assertThat(p.hansu, is(2));
		assertThat(p.code, is(20));
	}

	@Test
	public void when_tsumo_20_then_throw_IllegalArgumentException() {
		String[] args = {"ツモ", "20"};
		Parameter p = new ArgumentParser().parse(args);
		assertThat(p.tsumo, is(true));
		assertThat(p.hansu, is(1));
		assertThat(p.code, is(22));
	}
}
