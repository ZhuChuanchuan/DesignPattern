package com.tom.dp20State;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		State state=new State();
		Context context=new Context(state);
		state.setValue("state1");
		context.method();
		
		state.setValue("state2");
		context.method();
	}

}
