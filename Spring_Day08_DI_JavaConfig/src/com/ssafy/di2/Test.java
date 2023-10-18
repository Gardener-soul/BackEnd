package com.ssafy.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Desktop d1 = context.getBean("desktop", Desktop.class);
		Desktop d2 = context.getBean("desktop", Desktop.class);
		
		System.out.println(d1==d2);
		
		//Object type으로 반환되기 때문에 형변환 필요/
//		Programmer p = (Programmer) context.getBean("programmer");
//		p.coding();
	}
}
