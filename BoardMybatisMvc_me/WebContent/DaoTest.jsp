
<%@page import="org.comstudy.myweb.board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="org.comstudy.myweb.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
BoardDAO boardDao = new BoardDAO();
%>

<%
//select * from All
//List<BoardDTO> list = boardDao.selectAll();
//out.println(list);
%>

<%
//셀레트 원 하나만 찾는다!
//BoardDTO bto = boardDao.selectOne(new BoardDTO(3));
//out.println(bto);
%>

<%
// insert 테스트
BoardDTO dto = new BoardDTO(0,"뉴비6", "늅6@aaa.com", "테스트6", "어제가 내일이엿으면 좋겠다", "1234");
boardDao.insert(dto); 
out.println(dto);
// 1. BoardMapper에 id 엘리먼트 추가 
// 2. BoardDAO에 mybatis사용
%> 



<%
// 아직 안고친부분-------------------------------------------------------------------------------
//BoardDTO dto = new BoardDTO(1, "제목 수정", "내용 수정 테스트");
//boardDao.update(dto);
%>
<%
// delete 테스트
//BoardDTO dto = new BoardDTO(3);
//boardDao.delete(dto);
%>
</body>
</html>