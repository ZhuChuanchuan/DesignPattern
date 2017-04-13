package com.tom.dp21Visitor;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		// TODO Auto-generated method stub
		System.out.println("visit subject"+sub.getSubject());
		
	}

}
