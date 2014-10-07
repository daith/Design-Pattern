package com.design.factory.case1.operation;

public class AddOperator extends Operator {

	@Override
	public double getResult() {

		return this.getNumberA() + this.getNumberB();
	}

}
