package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		//Object type으로 반환되기 때문에 형변환 필요/
		Programmer p = (Programmer) context.getBean("programmer");

		p.coding();
	}
}
