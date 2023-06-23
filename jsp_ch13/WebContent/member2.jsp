<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id = "m" class = "test.web.MemberBean" scope="request"></jsp:useBean>
<jsp:setProperty property ="*" name ="m"/>
<!DOCTYPE html>
<%
String user = "HONG";
pageContext.setAttribute("user2", user);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- pageContext, request, session, application 등에 바인딩 된 데이터 사용 -->
<p>사용자 이름: ${m.name}</p>
<p>사용자 이름: <%=m.getName() %></p>
<p>User: ${user} </p>
<p>나이: ${m.age}</p>
<p>몸무게: ${m.weight}</p>
<p>키: ${m.height}</p>
<p>성별: ${m.sex}</p>
</body>
</html>