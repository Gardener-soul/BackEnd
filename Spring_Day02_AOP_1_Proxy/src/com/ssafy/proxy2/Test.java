package com.ssafy.proxy2;

public class Test {
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		Ssafy s = new Ssafy();
		
		PersonProxy px = new PersonProxy();
		
		px.setPerson(p); //s와 p를 넣어놓을 수 있다.
		px.coding();
		
		//각각의 클래스에 관점을 나누어 핵심 관심사항만 넣어놓고, 나머지의 공통적인 설정들만 개인적으로 커스터마이즈 하는 느낌.
		// 이전의, 이후의 그리고 예외의 것들 설정.
	}
}
