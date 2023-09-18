<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰는 창</title>
</head>
<body>
	<h2>게시글 등록</h2>
	<!-- 우리가 board에 보낼거고, Post방식을 사용할 것이다. -->
	<form action="board" method="POST">
		
		<input type = "hidden" name="act" value="write">
		제목 : <input type="text" name="title"> <br>
		쓰니 : <input type="text" name="writer"> <br>
		내용 : <textarea rows="10" cols="10" name="content"></textarea> <br>
		
		<button>등록</button>
	
	</form>
</body>
</html>