package com.example.payment;


import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentMethodUT {
	
	@Test
	public void when_tsumo_is_true_then_payment_is_taken_map() {
		PaymentMethod sut = new PaymentMethod();
		assertThat(sut.getPayment(1000, true), is(PaymentMethod.PAYMENT_MAP.get(1000)));
	}
	
	@Test
	public void when_tsumo_is_false_then_payment_is_created_new() {
		final Payment paymentMock = mock(Payment.class);
		PaymentMethod sut = new PaymentMethod() {
			Payment newPayment(int score) {
				return paymentMock;
			}
		};
		assertThat(sut.getPayment(1000, false), is(paymentMock));
	}
}
