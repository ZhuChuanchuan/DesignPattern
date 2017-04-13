package com.tom.dp06Adapter;

public class Adapter extends Source implements Targetable{

	/*  类的适配器模式  */
	
	// Adapter类集成Source类、实现Targetable接口
	
	@Override
	public void method2() {
		
		System.out.println("this is the targetable method!");
	}

	
}
