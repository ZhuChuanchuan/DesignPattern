package com.tom.dp13Strategy;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="20-2";
		ICalculator calc=new Minus();
		int res=calc.calculate(exp);
		System.out.println(res);
	}

}
