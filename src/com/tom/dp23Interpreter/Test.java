package com.tom.dp23Interpreter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//计算9+2-8
		int res=new Minus().Interpreter(new Context(new Plus().Interpreter(new Context(9,2)),8));
		System.out.println(res);
	}

}
