<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP Test</title>
</head>
<body>
<!-- 이것은 HTML 주석 -->

<%
/*
이것은 자바 주석 
*/
%>

<%--
이것은 JSP 주석
 --%>

<table>
	<tr>
		<td>Hello World!!</td>
	</tr>
</table>
<%
	out.println(getServletContext().getRealPath("./") );
%>

</body>
</html>