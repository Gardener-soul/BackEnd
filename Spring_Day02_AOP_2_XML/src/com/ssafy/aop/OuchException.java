package com.ssafy.aop;

public class OuchException extends RuntimeException {
	/* 이 친구를 예외 클래스로 만들고 싶어함.
	 * 그 방법에는 Exception과 Runtime Exception을 상속받아야함.
	 * 이 때 그 차이점은?
	 * 
	 * 
	 * 
	 * */
	
	public void handleException() {
		System.out.println("병원에 가자");
	}
}
