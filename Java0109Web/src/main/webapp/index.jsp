<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>게시판 만들기</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<body>
	<%
	//el 태그 기법, jstl도 있음
	String name = "Sphinx";
	//데이터베이스 접속하기
	Connection conn = null;
	PreparedStatement pstmt = null;
	String url = "jdbc:mariadb://wisejia.iptime.org:3306/springreference";
	String id = "springreference";
	String pw = "01234567";

	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection(url, id, pw);
	pstmt = conn.prepareStatement("SELECT * FROM multiboardview LIMIT 0, 10");
	ResultSet rs = pstmt.executeQuery();
	//servlet 자바 + HTML

	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

	while (rs.next()) {
		//map에 담아서 list로 add 합니다.
		Map<String, Object> ele = new HashMap<String, Object>();
		ele.put("mb_no", rs.getInt("mb_no"));
		ele.put("mb_title", rs.getString("mb_title"));
		ele.put("mb_date", rs.getString("mb_date"));
		ele.put("mname", rs.getString("mname"));
		ele.put("mb_like", rs.getString("mb_like"));
		ele.put("mb_load", rs.getString("mb_load"));
		list.add(ele);
	}
	%>
	<h1><%=name%></h1>
	<button type="button" class="btn btn-primary" onclick="location.href='./login.jsp'">로그인</button>
	<button type="button" class="btn btn-danger" onclick="location.href='./write.jsp'">글쓰기</button>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>글쓴이</th>
				<th>좋아요</th>
				<th>읽음</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).get("mb_no") %></td>
				<td><%=list.get(i).get("mb_title") %></td>
				<td><%=list.get(i).get("mb_date") %></td>
				<td><%=list.get(i).get("mname") %></td>
				<td><%=list.get(i).get("mb_like") %></td>
				<td><%=list.get(i).get("mb_load") %></td>
			</tr>
			<%
			}
			%>


		</tbody>
	</table>
</body>
</html>