package com.ssafy.di3;

public class Desktop implements Computer {
	//필드(생략) ex) CPU, 그래픽카드, 키보드
	
	// 메소드를 구현하던지, 추상클래스로 만들어버리던지! Computer라는 Interface를 상속했으니!
	
	public String getInfo() {
		
		return "데스크톱";
	}
	
}
