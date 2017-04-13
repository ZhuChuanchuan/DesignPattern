package com.tom.dp02AbstractFactory;

public class Test {

	public static void main(String[] args) {
		// 相比工厂模式，对于新的需求，只需实现类实现Sender接口，工厂类实现Provider接口，无需改动原来的代码
		Provider provider=new SendMailFactory();
		Sender sender=provider.produce();
		sender.Send();
	}

}
