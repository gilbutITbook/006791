package com.example;

public class StressBase {

	protected int waitTime = 1000;
	
	protected void stress() {
		System.out.println("executing...");
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
