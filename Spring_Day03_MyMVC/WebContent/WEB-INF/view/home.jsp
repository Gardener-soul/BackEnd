 <%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����</title>
</head>
<body>
	<h2>���� Ȩ</h2>
	${msg }
	
	<form action ="test4" method="POST">
		�Ƶ� : <input type ="text" name="id">
		��� : <input type ="password" name="pw">
		���� : <input type ="number" name="age">
		<button>���</button>
	</form>
</body>
</html>