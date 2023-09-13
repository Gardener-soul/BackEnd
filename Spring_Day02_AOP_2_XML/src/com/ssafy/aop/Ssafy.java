package com.ssafy.aop;

import java.util.Random;

public class Ssafy implements Person {
	
	public void coding() {
		System.out.println("열심히 공부를 작성한다."); //핵심 관심사항
		if(new Random().nextBoolean()) {
			throw new OuchException();
		}
	}
	
	
}
