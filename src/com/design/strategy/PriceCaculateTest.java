package com.design.strategy;

import com.design.strategy.service.BonusCashImpl;
import com.design.strategy.service.CashService;
import com.design.strategy.service.DiscountCashImpl;
import com.design.strategy.service.NormalCashImpl;

public class PriceCaculateTest {

	public static void main(String[] args) {
		
//		invokeFactory();
		try {
			invokeStrategy(CashType.DISCOUNT,500);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error;");
		}
		
	}

	private static void invokeStrategy(CashType cash,double price ) throws Exception {
		
		PriceCaculateContex context = null;
		switch (cash){
		case BONUS:
			context = new PriceCaculateContex(new BonusCashImpl(800.0,100.0));
		break;
		case DISCOUNT:
			context = new PriceCaculateContex(new DiscountCashImpl(0.8));
		case NORMA:
			context = new PriceCaculateContex(new NormalCashImpl());
		default: 
		throw new Exception("Param is Error.");
	}
		context.getPrice(price);
	}

	private static void invokeFactory(CashType cash,double price) {
		CashService service = PriceCaculateFactory.caculatePrice(cash);
		double totalePrice = service.caculatePrice(price);
	}

}
