<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 정보 등록 폼</h1>
   <form action="member2.jsp" method="POST">
      <table>
         <tr>
            <th>사용자 이름</th>
            <td><input type="text" name="name" value="최승현"/></td>
         </tr>
         <tr>
            <th>나이</th>
            <td><input type="text" name="age" value="35"/></td>
         </tr>
         <tr>
            <th>몸무게</th>
            <td><input type="text" name="weight" value="69"/></td>
         </tr>
         <tr>
            <th>키</th>
            <td><input type="text" name="height" value="174"/></td>
         </tr>
         <tr>
            <th>성별</th>
            <td><input type="text" name="sex" value="남"/></td>
         </tr>
         <tr>
         <th></th><td><input type="submit" value="보내기" /></td>
         </tr>
      </table>
   </form>

</body>
</html>