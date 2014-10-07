package com.design.factory.case1;

import java.util.Scanner;

import com.design.factory.case1.operation.Operator;

public class OperatorMain {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�JnumberA:");
		double numberA = scanner.nextDouble();
		
		System.out.println("�п�JnumberB:");
		double numberB = scanner.nextDouble();
		
		System.out.println("�п�J�B���(+-*/)");
		String opertion = scanner.next();
		Operator operator = OperatorFactory.createOperator(opertion);
		operator.setNumberA(numberA);
		operator.setNumberB(numberB);
		System.out.println(numberA +" " + opertion +" " +numberB + "=" +operator.getResult());
	}

}
