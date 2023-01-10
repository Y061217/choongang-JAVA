<%@page import="com.poseidon.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 전송</title>
</head>
<body>
	<%
	String title = request.getParameter("title");
	String content = request.getParameter("content");

	//DAO 호출
	BoardDAO dao = new BoardDAO();
	dao.write(title, content);
	
	//페이지 이동
	response.sendRedirect("./index.jsp");
	%>

	<hr>
	입력하신 title은
	<%=title %><br> 입력하신 content은
	<%=content %>

</body>
</html>