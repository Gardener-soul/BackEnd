<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%! int A = 10;
	int B = 10;
		
	String name = "은수";
		
	//메서드 선언 가능
	public int add(int A, int B){
		return A+B;
	}
		
	public int abs(int A){
		return A>0 ? A : -A;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부</title>
</head>
<body>

	
	<%
		out.println(add(A,B));
	%> <br>
	
	<%
		out.println(abs(A));
	%> <br>
	<%
		out.println(name);
	%> <br>
</body>
</html>