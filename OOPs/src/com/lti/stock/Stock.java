package com.lti.stock;

//public class Stock extends Exchange {

public class Stock implements Exchange {
	
	@Override
	public void setQuote() {
		System.out.println("Set quote");
	}

	@Override
	public void getQuote() {
		System.out.println("Get quote");
	}

	@Override
	public void viewQuote() {
		System.out.println("View quote");
	}
}
