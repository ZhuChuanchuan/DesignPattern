package com.tom.dp03Singleton;

public class Singleton {

	//����ʽ����ģʽ��û�п����̰߳�ȫ����
	private Singleton(){}
	private static Singleton single=null;
	public static Singleton getInstance(){
		if(single==null){
			single=new Singleton();
		}
		return single;
	}
	//�Ľ�1 ��getInstance�����ϼ�ͬ��
	/*
	 * public static synchronized Singleton getInstance(){
	 * 		if(single==null){
	 * 			single=new Singleton();
	 * 		}
	 * 		return single;
	 * }
	 * 
	 */
	
	//�Ľ�2 ˫�ؼ������
	/*
	 * public static Singleton getInstance(){
	 * 		if(singleton==null){
	 * 			synchronized(Singleton.class){
	 * 				if(singleton==null){
	 * 					singleton=new Singleton();
	 * 				}
	 * 			}
	 * 		}
	 * 		return singleton;
	 * }
	 * 
	 */
	
	//�Ľ�3 ��̬�ڲ���
	/*
	 * 
	 * public class Singleton{
	 * 		private static class lazyHolder{
	 * 			private static final Singleton INSTANCE=new Singleton();
	 * 		}
	 * 		private Singleton(){}
	 * 		public static final Singleton getInstance(){
	 * 			return lazyHolder.INSTANCE;
	 * 		}
	 * 
	 */
}
