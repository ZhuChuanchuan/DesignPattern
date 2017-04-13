package com.tom.dp14TemplateMethod;

public class TemplateMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCalculator calc=new Multiply();
		int res=calc.calculate("7*8", "\\*");
		System.out.println(res);
	}

}
