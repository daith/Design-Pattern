package com.design.factory.case1;

import com.design.factory.case1.operation.AddOperator;
import com.design.factory.case1.operation.DivOperator;
import com.design.factory.case1.operation.MultipleOperator;
import com.design.factory.case1.operation.Operator;
import com.design.factory.case1.operation.SubOperator;

public class OperatorFactory {

	public static Operator createOperator(String operation) {
		
		Operator operator = null;
		if ("+".equals(operation)){
			operator = new AddOperator();
		}else if ("-".equals(operation)){
			operator = new SubOperator();
		}else  if ("*".equals(operation)){
			operator = new MultipleOperator();
		}else  if ("/".equals(operation)){
			operator = new DivOperator();
		}
		return operator;
	}

}
