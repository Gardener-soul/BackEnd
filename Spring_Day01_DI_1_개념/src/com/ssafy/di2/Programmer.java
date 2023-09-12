package com.ssafy.di2;

public class Programmer {
	//프로그래머는 컴퓨터를 가지고 있어야 된다
	
	private Desktop computer;
	
	public Programmer(Desktop computer) {
	
		//객체 생성 의존성 제거, 더 이상 new 하지 말고 넣어줘
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 한다.");
	}
	
}
