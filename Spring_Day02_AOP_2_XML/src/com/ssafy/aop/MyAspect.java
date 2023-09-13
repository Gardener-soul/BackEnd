package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

//공통관심사항들을 작성할 클래스를 생성한다.
public class MyAspect {
	// Aspect : 여러 클래스에 공통적으로 구현되는 관심사의 모듈화.
	// Join Point : 메서드 실행이나 예외처리와 같은 프로그램 실행중의 특정 지점.
	// point cut : 조인 포인트에서 Aspect를 적용하기 위한 조건 서술
	// 이것들은 지금 Advice : 특정 조인포인트(Join Point)에서 Aspect에 의해서 취해진 행동.
	// Around, Before, After등의 Advice 타입이 존재.
	
	// 실행 이전
	public void before() {
		System.out.println("컴퓨터를 부팅한다.");
	}
	// 실행 이후 (예외 없이)
	public void afterReturning() {
		System.out.println("Git에 Push한다.");
	}
	// 예외 발생 (Instance of)
	public void afterThrowing(Throwable th) {
		System.out.println("반차를 낸다.");
		if(th instanceof OuchException) {
			((OuchException) th).handleException();
		}
	}
	public void after() {
		System.out.println("하루를 마무리한다.");
	}
	
	/////////////////////
	// around -- try catch 구문을 사용했기 때문에, error가 발생하지 않음.
	
	public void around(ProceedingJoinPoint pjt) {
		
		this.before();
		
		try {
			pjt.proceed();
			this.afterReturning();
		} catch (Throwable e) {
			this.afterThrowing(e);
		} finally {
			this.after();
		}
		
	}
}
