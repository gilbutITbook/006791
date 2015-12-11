package com.example.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentMethod {

	private static final Map<Integer, Payment> PAYMENT_MAP;
	
	static {
		PAYMENT_MAP = new HashMap<>();
		PAYMENT_MAP.put(1000, new Payment(500, 300));
		PAYMENT_MAP.put(1300, new Payment(700, 400));
		PAYMENT_MAP.put(1600, new Payment(800, 400));
		PAYMENT_MAP.put(2000, new Payment(1000, 500));
		PAYMENT_MAP.put(2300, new Payment(1200, 600));
		PAYMENT_MAP.put(2600, new Payment(1300, 700));
		PAYMENT_MAP.put(3200, new Payment(1600, 800));
		PAYMENT_MAP.put(3900, new Payment(2000, 1000));
		PAYMENT_MAP.put(4500, new Payment(2300, 1200));
		PAYMENT_MAP.put(5200, new Payment(2600, 1300));
		PAYMENT_MAP.put(6400, new Payment(3200, 1600));
		PAYMENT_MAP.put(7700, new Payment(3900, 2000));
		PAYMENT_MAP.put(8000, new Payment(4000, 2000));
	}
	
	public PaymentReceipt getPayment(int score, boolean tsumo) {
		if(tsumo) {
			return new PaymentReceipt(PAYMENT_MAP.get(score));
		}
		return new PaymentReceipt(new Payment(score));
	}
}
