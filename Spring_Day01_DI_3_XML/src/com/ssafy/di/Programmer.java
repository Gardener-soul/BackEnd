package com.ssafy.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
	//프로그래머는 컴퓨터를 가지고 있어야 된다
	
	@Autowired
	private Computer computer;
	
	public Programmer() {
	}
	
	public Programmer(Computer computer) {
	
		//객체 생성 의존성 제거, 더 이상 new 하지 말고 넣어줘
		this.computer = computer;
	}
	
	// 설정자(setter) 주입
	// 필드 이름에 set을 붙이고 첫글자를 대문자로 바꾼 형태
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 한다.");
	}
	
}
