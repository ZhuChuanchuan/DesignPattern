package com.tom.dp02AbstractFactory;

public class Test {

	public static void main(String[] args) {
		// ��ȹ���ģʽ�������µ�����ֻ��ʵ����ʵ��Sender�ӿڣ�������ʵ��Provider�ӿڣ�����Ķ�ԭ���Ĵ���
		Provider provider=new SendMailFactory();
		Sender sender=provider.produce();
		sender.Send();
	}

}
