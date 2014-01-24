package com.design.strategy;

import com.design.strategy.service.BonusCashImpl;
import com.design.strategy.service.CashService;
import com.design.strategy.service.DiscountCashImpl;
import com.design.strategy.service.NormalCashImpl;

public class PriceCaculateFactory {
	
	
	public static CashService caculatePrice(CashType cash){
		CashService service = null;
		switch (cash){
			case BONUS:
			service = new BonusCashImpl(800.0,100.0);
			break;
			case DISCOUNT:
				service = new DiscountCashImpl(0.8);
			case NORMA:
				service = new NormalCashImpl();
			default: 
			System.err.println("Not Found!");
		}
		return service;
		
	}
}
