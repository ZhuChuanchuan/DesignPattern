package com.tom.dp03Singleton;

public class Singleton {

	//懒汉式单例模式，没有考虑线程安全问题
	private Singleton(){}
	private static Singleton single=null;
	public static Singleton getInstance(){
		if(single==null){
			single=new Singleton();
		}
		return single;
	}
	//改进1 在getInstance方法上加同步
	/*
	 * public static synchronized Singleton getInstance(){
	 * 		if(single==null){
	 * 			single=new Singleton();
	 * 		}
	 * 		return single;
	 * }
	 * 
	 */
	
	//改进2 双重检查锁定
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
	
	//改进3 静态内部类
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
