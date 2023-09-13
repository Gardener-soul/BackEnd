package com.ssafy.proxy2;

import java.util.Random;

import com.ssafy.proxy.OuchException;

public class PersonProxy implements Person{

	private Person person;
	
	//필드 주입
	//생성자 주입
	//설정자 주입
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void coding() {
		System.out.println("컴퓨터를 부팅한다."); // (핵심 관심사항) 이전에 해야할 것
		try {			
			person.coding();
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
