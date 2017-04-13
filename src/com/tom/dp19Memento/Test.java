package com.tom.dp19Memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建初始类
		Original org=new Original("egg");
		//创建备忘录
		Storage storage=new Storage(org.createMemento());
		//修改原始类
		System.out.println("原始状态"+org.getValue());
		org.setValue("niiu");
		System.out.println("修改后的状态"+org.getValue());
		
		//恢复原始状态
		org.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态"+org.getValue());
		
	}

}
