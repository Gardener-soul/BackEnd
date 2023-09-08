<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반찬고르기</title>
</head>
<body>
	<c:forEach var="item" items="${paramValues.dish}" varStatus="status">
		${item }<c:if test="${not status.last}">,</c:if> 
							<!-- 마지막게 아니라면 ,를 붙이겠다. -->
	</c:forEach>
	
</body>
</html>