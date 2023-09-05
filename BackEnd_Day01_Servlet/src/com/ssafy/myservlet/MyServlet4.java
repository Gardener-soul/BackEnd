package com.ssafy.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//고전 방식으로 등록해보자 But 고정방식으로 등록할 일이 앞으로는 없다.
public class MyServlet4 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	//doXXXX 이런거 한개는 만들어야한다.
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<head>");
		writer.append("<title>Hello</title>");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<h1>Hello Servlet!</h1>");
		writer.append("</body>");
		writer.append("</html>");
	}
} 
