package com.tom.dp08Proxy;

public class Proxy implements Sourceable {

	private Source source;
	public Proxy(){
		super();
		this.source=new Source();
	}
	@Override
	public void mehtod() {
		// TODO Auto-generated method stub
		before();
		source.mehtod();
		after();
	}
	private void after() {
		// TODO Auto-generated method stub
		System.out.println("after proxy");
	}
	private void before() {
		// TODO Auto-generated method stub
		System.out.println("before proxy");
	}

}
