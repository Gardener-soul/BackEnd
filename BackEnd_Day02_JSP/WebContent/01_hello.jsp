<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<%
	
		String name = "박은수";
	
	%>
	<h2>Hello JSP</h2>
	<h4>안녕하세요. <%=name%> 입니다.</h4>
</body>
</html>