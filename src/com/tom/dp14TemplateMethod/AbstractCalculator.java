package com.tom.dp14TemplateMethod;

public abstract class AbstractCalculator {

	public abstract int calculate(String exp,String opt);
	
	public int[] split(String exp,String opt){
		String array[]=exp.split(opt);
		int arrayInt[]=new int[2];
		arrayInt[0]=Integer.parseInt(array[0]);
		arrayInt[1]=Integer.parseInt(array[1]);
		return arrayInt; 
	}
}
