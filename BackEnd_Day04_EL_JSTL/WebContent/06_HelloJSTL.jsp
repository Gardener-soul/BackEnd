<%@page import="com.ssafy.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<c:out value="Hello SSAFY!"></c:out><br>
	<c:out value="Hello SSAFY 닫는 태그가 없어도 괜찮아!"/><br>
	
	<!-- c:set을 써보자 
		scope : 영역을 설정할 수 있고, 만약에 생략한다면 page
		var : 변수이름
		value : 값
	-->
	<c:set var="msg" value="Hello"/>
	${msg }<br>
	<c:set var="msg">Hello</c:set>
	${msg }<br>
	
	<c:set var="person" value="<%=new com.ssafy.dto.Person()%>"/>


</body>
</html>