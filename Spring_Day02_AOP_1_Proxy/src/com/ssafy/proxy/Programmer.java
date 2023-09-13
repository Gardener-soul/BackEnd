package com.ssafy.proxy;

import java.util.Random;

public class Programmer {
	public Programmer(){
	}
	
	//프로그래머의 일상
	public void coding() {
	
		System.out.println("컴퓨터를 부팅한다."); // (핵심 관심사항) 이전에 해야할 것
		try {			
			System.out.println("열심히 코드를 작성한다."); //핵심 관심사항
			if(new Random().nextBoolean()) {
				throw new OuchException();
			}
			System.out.println("git에 Push한다."); // (핵심 관심사항)이 이상없이 마무리가 되었을 때
		} catch (OuchException e) {
			System.out.println("반차를 낸다.");	// (핵심 관심사항) 중 예외가 발생.
		} finally {
			System.out.println("보람찬 하루를 마무리한다."); // 모든게 마무리가 되었을 때			
		}
		

	}
	
	
}
