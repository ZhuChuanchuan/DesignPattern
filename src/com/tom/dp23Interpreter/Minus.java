package com.tom.dp23Interpreter;

public class Minus implements Expression {

	@Override
	public int Interpreter(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1()-context.getNum2();
	}

}
