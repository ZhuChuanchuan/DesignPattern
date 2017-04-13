package com.tom.dp18Command;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver=new Receiver();
		Command cmd=new MyCommand(receiver);
		Invoker invoker=new Invoker(cmd);
		invoker.action();
	}

}
