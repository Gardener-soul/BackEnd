package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		//Object type으로 반환되기 때문에 형변환 필요/
		Programmer p = (Programmer) context.getBean("programmer");
		//형변환 하지 않으려면 이런 방식으루
		Desktop desktop = context.getBean("desktop", Desktop.class);
		
		Desktop d1 = context.getBean("desktop", Desktop.class);
		Desktop d2 = context.getBean("desktop", Desktop.class);
		
		System.out.println(d1==d2);
		
//		p.setComputer(desktop);
//		p.coding();
	}
}
