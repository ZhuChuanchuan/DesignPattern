package com.tom.dp04Builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	
	private List<Sender> list=new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	public void produceSmsSender(int count){
		for(int j=0;j<count;j++){
			list.add(new SmsSender());
		}
	}
}
