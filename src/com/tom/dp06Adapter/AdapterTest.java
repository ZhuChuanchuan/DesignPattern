package com.tom.dp06Adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// ���������ģʽ
		/*
		Targetable target=new Adapter();
		target.method1();
		target.method2();
		*/
		
		//�����������ģʽ
		Source source=new Source();
		Targetable target=new Wrapper(source);
		target.method1();
		target.method2();
	}

}
