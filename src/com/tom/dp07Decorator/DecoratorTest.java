package com.tom.dp07Decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source=new Source2();
		Sourceable obj=new Decorator(source);
		obj.method();
	}

}
