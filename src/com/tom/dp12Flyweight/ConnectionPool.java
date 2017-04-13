package com.tom.dp12Flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool;
	
	/* ��������  */
	private String url="jdbc:mysql://localhost:3306/test";
	private String username="root";
	private String password="root";
	private String driverClassName="com.mysql.jdbc.Driver";
	
	private int poolSize=100;
	private static ConnectionPool instance=null;
	Connection conn=null;
	
	/* ���췽������һЩ��ʼ������  */
	private ConnectionPool(){
		try {
			Class.forName(driverClassName);
			conn=DriverManager.getConnection(url,username,password);
			pool.add(conn);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/* �������ӵ����ӳ�  */
	public synchronized void release(){
		pool.add(conn);
	}
	
	/* �������ӳ��е�һ�����ݿ�����  */
	public synchronized Connection getConnection(){
		if(pool.size()>0){
			Connection conn=pool.get(0);
			pool.remove(conn);
			return conn;
		}else{
			return null;
		}
	}
}
