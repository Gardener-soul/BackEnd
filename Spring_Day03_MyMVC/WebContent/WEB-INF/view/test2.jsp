<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Test</title>
</head>
<body>
	<h2>Test2</h2>
	1.${pageScope.msg }<br>
	1.${requestScope.msg }<br>
	1.${sessionScope.msg }<br>
	1.${applicationScope.msg }<br>
	
	${msg }
</body>
</html>