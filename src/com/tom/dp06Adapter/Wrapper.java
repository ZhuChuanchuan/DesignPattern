package com.tom.dp06Adapter;

public class Wrapper implements Targetable {

	/*  �����������ģʽ  */
	
	private Source source;
	
	public Wrapper(Source source){
		super();
		this.source=source;
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}

}
