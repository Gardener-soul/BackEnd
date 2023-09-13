package com.ssafy.aop;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class Programmer implements Person {
	
	@Override
	public void coding() {
		System.out.println("열심히 코드를 작성한다."); //핵심 관심사항
		if(new Random().nextBoolean()) {
			throw new OuchException();
		}
	}
	
}
