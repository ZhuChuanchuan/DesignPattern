package com.tom.dp21Visitor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Visitor visitor=new MyVisitor();
		Subject subject=new MySubject();
		subject.accept(visitor);
	}

}
