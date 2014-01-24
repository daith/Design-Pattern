package com.design.strategy.service;

public class DiscountCashImpl extends CashService {
	
	private double discountRate;
	
	

	public DiscountCashImpl(double discountRate) {
		super();
		this.discountRate = discountRate;
	}



	@Override
	public double caculatePrice(double cash) {
		
		return cash * this.discountRate;
	}

}
