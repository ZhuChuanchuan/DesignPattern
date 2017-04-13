package com.tom.dp13Strategy;

public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int[] arrayInt=super.split(exp, "\\-");
		return arrayInt[0]-arrayInt[1];
	}

}
