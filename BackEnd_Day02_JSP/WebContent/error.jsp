<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오류가 났네요</title>
</head>
<body>
	<h1>오류났을 때 오는 페이지</h1>
	<%= exception.getMessage() %>
</body>
</html>