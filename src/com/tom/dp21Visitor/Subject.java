package com.tom.dp21Visitor;

public interface Subject {

	public void accept(Visitor visitor);
	public String getSubject();
}
