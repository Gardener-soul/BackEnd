<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//실제로는 id와 password를 가지고 DB와 통신을 한 후에 실제로 우리의 유저인지를 파악해야함.
	if(id.equals("ssafy") && password.equals("1234")){
		//로그인 성공
		//Servlet 기준 , 세션을 얻어오고 해당 세션에 저장한다.
		//HttpSession session = request.getSession();//
		session.setAttribute("loginUser", id); //id 혹은 닉네임 혹은 이름
		response.sendRedirect("main.jsp");
		
	} else {
		//로그인 실패
		response.sendRedirect("loginForm.jsp");
	}
	
%>