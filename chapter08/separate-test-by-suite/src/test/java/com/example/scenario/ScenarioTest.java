package com.example.scenario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.example.ArgumentParser;
import com.example.Main;
import com.example.Parameter;
import com.example.payment.Payment;
import com.example.payment.PaymentReceipt;

public class ScenarioTest {
	
	@Test
	public void when_tsumo_20_then_parent_pays_500_and_children_pay_300() {
		String[] args = {"ツモ", "20"};
		Parameter param = new ArgumentParser().parse(args);
		Payment payment = new Main().execute(param);
		PaymentReceipt result = new PaymentReceipt(payment);
		assertThat(result.getReceipt(), is("親： 500点、子： 300点です。"));
	}
	
	@Test
	public void when_men_tan_pin_30_then_someone_pays_3900() {
		String[] args = {"メン", "タン", "ピン", "30"};
		Parameter param = new ArgumentParser().parse(args);
		Payment payment = new Main().execute(param);
		PaymentReceipt result = new PaymentReceipt(payment);
		assertThat(result.getReceipt(), is("3900点です。"));
	}
}
