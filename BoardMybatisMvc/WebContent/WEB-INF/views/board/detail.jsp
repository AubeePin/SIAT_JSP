<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>상세보기</h1>
<c:out value="${board }"></c:out>
<a href="modify.do?num=${board.num}">수정</a>
<a href="delete.do?num=${board.num}">삭제</a>

</body>
</html>