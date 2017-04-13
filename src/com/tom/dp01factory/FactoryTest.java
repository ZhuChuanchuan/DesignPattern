package com.tom.dp01factory;

public class FactoryTest {

	public static void main(String[] args) {
		//普通工厂模式
		/*
		SenderFactory factory=new SenderFactory();
		Sender sender=factory.produce("sms");
		sender.Send();
		*/
		//多个工厂方法模式
		/*
		SenderFactory factory =new SenderFactory();
		Sender sender=factory.procudeSms();
		sender.Send();
		*/
		Sender sender=SenderFactory.produceMail();
		sender.Send();
	}

}
