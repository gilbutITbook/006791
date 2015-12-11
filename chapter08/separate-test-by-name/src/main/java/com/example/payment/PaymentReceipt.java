package com.example.payment;

public class PaymentReceipt {
	private Payment payment;
	
	public PaymentReceipt(Payment payment) {
		this.payment = payment;
	}
	
	public String getReceipt() {
		if(payment.isTsumo()) {
			return "親： " + payment.getPaymentByParent() + "点、子： " + 
					payment.getPaymentPerChild() + "点です。";
		}
		return payment.getPaymentBySomeone() + "点です。";
	}
}
