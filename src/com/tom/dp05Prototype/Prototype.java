package com.tom.dp05Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * ǳ����
	 */
	/*
	public Object clone() throws CloneNotSupportedException{
		Prototype proto=(Prototype)super.clone();
		return proto;
	}
	*/
	
	private String string;
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	private SerializableObject obj;
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		/* д�뵱ǰ����Ķ������� */
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		/* �������������������¶��� */
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return ois.readObject();
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	
	
}
class SerializableObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
