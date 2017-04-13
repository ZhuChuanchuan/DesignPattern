package com.tom.dp01factory;

public class SenderFactory {

	//��ͨ����ģʽ
	/*
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("��������ȷ������!");
			return null;
		}
	}
	*/
	
	//�����������ģʽ
	/*
	public Sender produceMail(){
			return new MailSender();
	}
	public Sender procudeSms(){
			return new SmsSender();
	}
	*/
	
	//��̬��������ģʽ
	public static Sender produceMail(){
		return new  MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
