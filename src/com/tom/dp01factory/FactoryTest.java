package com.tom.dp01factory;

public class FactoryTest {

	public static void main(String[] args) {
		//��ͨ����ģʽ
		/*
		SenderFactory factory=new SenderFactory();
		Sender sender=factory.produce("sms");
		sender.Send();
		*/
		//�����������ģʽ
		/*
		SenderFactory factory =new SenderFactory();
		Sender sender=factory.procudeSms();
		sender.Send();
		*/
		Sender sender=SenderFactory.produceMail();
		sender.Send();
	}

}
