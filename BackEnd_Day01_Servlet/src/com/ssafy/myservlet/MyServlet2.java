package com.ssafy.myservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//제네릭 서블릿 요녀석 추상클래스이군
public class MyServlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 서비스만 구현하면 OK군
		
	}

	
	
} 
