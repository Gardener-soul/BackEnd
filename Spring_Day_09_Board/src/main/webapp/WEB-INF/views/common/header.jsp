<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>
	<c:if test="${empty loginUser }">
		<a href="login" class = "btn btn-outline-primary">로그인</a>
		<a href="signup" class = "btn btn-outline-secondary">회원가입</a>
	</c:if>
	<c:if test="${not empty loginUser }">
		${loginUser }님 안녕하세용~.
		<a href="logout" class = "btn btn-outline-danger">로그아웃</a>
		<c:if test="${'박은수' eq loginUser}">
			<a href="users">관리자 페이지로 가자</a>
		</c:if>
	</c:if>
</div>