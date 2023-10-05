<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<h2>파일 업로드</h2>
	
	<!-- action : 어떠한 요청을 내가 보낼거다-->
	<!-- (앞에 슬래시 없음) upload : URL 상에서 regist대신 upload로 변하고 작성이 됨
			/upload : URL 상에서 localhost:8800/upload와 같이, 아예 처음부터 시작하는 느낌 -->
	<form action = "upload" method="POST" enctype="multipart/form-data">
		<input type ="file" name = "upload_file">
		<input type = "submit" value = "파일 등록">
		<button>제출</button>
	</form>
	
	<!-- 여러개의 파일을 올려ㅗ자 -->
	<form action = "upload2" method="POST" enctype="multipart/form-data">
		<input type ="file" name = "upload_files" multiple="multiple">
		<input type = "submit" value = "파일 등록">
		<button>제출</button>
	</form>
</body>
</html>