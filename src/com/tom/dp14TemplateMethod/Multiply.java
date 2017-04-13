package com.tom.dp14TemplateMethod;

public class Multiply extends AbstractCalculator {

	@Override
	public int calculate(String exp, String opt) {
		// TODO Auto-generated method stub
		int[] preRes=super.split(exp, opt);
		
		return preRes[0]*preRes[1];
	}

	

}
