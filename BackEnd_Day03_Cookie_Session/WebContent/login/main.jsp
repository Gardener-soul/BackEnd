<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>

	<%
	if(session.getAttribute("loginUser")==null){
		response.sendRedirect("loginForm.jsp");
	} else {
	%>
		<%= session.getAttribute("loginUser") %>님 반갑습니다.
	<%
	}
	%>
	<!-- Logout 기능 -->
	<form action = "logout.jsp" method = "POST">
		<button>로그아웃</button>
	</form>
	


	<h2>메인 페이지</h2>
	<!-- 여러 기능들이 있다. -->
</body>
</html>