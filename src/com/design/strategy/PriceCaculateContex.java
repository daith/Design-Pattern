package com.design.strategy;

import com.design.strategy.service.BonusCashImpl;
import com.design.strategy.service.CashService;
import com.design.strategy.service.DiscountCashImpl;
import com.design.strategy.service.NormalCashImpl;

public class PriceCaculateContex {
	private CashService cashSerive ;

	public PriceCaculateContex(CashType cashType) {
		super();
		switch (cashType){
		case BONUS:
			cashSerive = new BonusCashImpl(800.0,100.0);
		break;
		case DISCOUNT:
			cashSerive = new DiscountCashImpl(0.8);
		case NORMA:
			cashSerive = new NormalCashImpl();
		default: 
		System.err.println("Not Found!");
	}
		
	}
	
	public PriceCaculateContex(CashService cashSerive) {
		super();
		this.cashSerive = cashSerive;
	}
	
	public double getPrice(double price){
		return cashSerive.caculatePrice(price);
	}
}
