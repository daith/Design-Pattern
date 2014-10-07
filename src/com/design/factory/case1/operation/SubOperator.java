package com.design.factory.case1.operation;

public class SubOperator extends Operator {

	@Override
	public double getResult() {
		
		return this.getNumberA()-this.getNumberB();
	}

}
