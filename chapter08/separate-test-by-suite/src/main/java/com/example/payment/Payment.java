package com.example.payment;

public class Payment {

	private int paymentByParent;
	private int paymentPerChild;
	private int paymentBySomeone;
	
	public Payment(int paymentBySomeone) {
		this.paymentBySomeone = paymentBySomeone;
	}
	
	public Payment(int paymentByParent, int paymentPerChild) {
		this.paymentByParent = paymentByParent;
		this.paymentPerChild = paymentPerChild;
	}

	public int getPaymentByParent() {
		return paymentByParent;
	}

	public int getPaymentPerChild() {
		return paymentPerChild;
	}

	public int getPaymentBySomeone() {
		return paymentBySomeone;
	}
	
	public boolean isTsumo() {
		return paymentBySomeone == 0;
	}
}
