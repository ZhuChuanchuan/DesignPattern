package com.tom.dp06Adapter;

public class Adapter extends Source implements Targetable{

	/*  ���������ģʽ  */
	
	// Adapter�༯��Source�ࡢʵ��Targetable�ӿ�
	
	@Override
	public void method2() {
		
		System.out.println("this is the targetable method!");
	}

	
}
