package com.tom.dp03Singleton;

public class Singleton2 {

	public  Singleton2(){}
	private static final Singleton2 single=new Singleton2();
	//��̬��������
	public static Singleton2 getInstance(){
		return single;
	}
}
