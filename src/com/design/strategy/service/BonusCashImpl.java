package com.design.strategy.service;

public class BonusCashImpl extends CashService {

	private double bonusCondition;
	private double bonusReturn;
	
	public BonusCashImpl(double bonusCondition, double bonusReturn) {
		super();
		this.bonusCondition = bonusCondition;
		this.bonusReturn = bonusReturn;
	}



	@Override
	public double caculatePrice(double cash) {
		double result = cash;
		
		if(cash>=this.bonusCondition)
		result = cash -Math.floor(cash/this.bonusCondition)*this.bonusReturn;
		return result;
	}

}
