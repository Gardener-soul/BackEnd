package com.ssafy.myservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//해당 클래스를 서블릿으로 만들기 위해서는 Servlet을 구현해야한다.
public class MyServlet1 implements Servlet {

	@Override
	public void destroy() {
		// 서블릿이 소멸될 때 동작할 것 가타.
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// 서빌릿 설정을 반환
		return null;
	}

	@Override
	public String getServletInfo() {
		// 서블릿의 정보를 문자열로 반환
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// 서블릿을 초기화하는 듯
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 이 붑분에서 요청과 응답같은 것을 처리
		
	}

	
	
}
