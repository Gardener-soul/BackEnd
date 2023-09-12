package com.ssafy.di1;

public class Programmer {
	//프로그래머는 컴퓨터를 가지고 있어야 된다
	
	private Laptop computer;
	
	public Programmer() {
		computer = new Laptop();
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 한다.");
	}
	
}
