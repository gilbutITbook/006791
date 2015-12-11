package com.example.payment;

import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentReceiptUT {

	@Test
	public void when_score_is_1000_and_tsumo_is_ture_then_payment_is_500_300() {
		Payment payment = mock(Payment.class);
		when(payment.isTsumo()).thenReturn(true);
		when(payment.getPaymentByParent()).thenReturn(500);
		when(payment.getPaymentPerChild()).thenReturn(300);
		
		PaymentReceipt sut = new PaymentReceipt(payment);
		assertThat(sut.getReceipt(), is("親： 500点、子： 300点です。"));
	}
	
	@Test
	public void when_score_is_1000_tsumo_is_false_then_payment_receipt_is_1000() {
		Payment payment = mock(Payment.class);
		when(payment.isTsumo()).thenReturn(false);
		when(payment.getPaymentBySomeone()).thenReturn(1000);
		
		PaymentReceipt sut = new PaymentReceipt(payment);
		assertThat(sut.getReceipt(), is("1000点です。"));
	}
}
