package com.design.factory.case1.operation;

public class DivOperator extends Operator {

	@Override
	public double getResult() throws Exception {
		
		if(this.getNumberB() ==0){
			throw new Exception("Number B ¤£¥i¬°0!");
		}
		return this.getNumberA() / this.getNumberB();
	}

}
