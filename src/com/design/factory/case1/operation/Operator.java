package com.design.factory.case1.operation;

public abstract  class Operator {
	private double numberA, numberB = 0;

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	public abstract double getResult() throws Exception;
	
}
