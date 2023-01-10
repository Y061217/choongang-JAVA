<%@page import="com.poseidon.db.DBConnection"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 패스워드 확인</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//DB연결하기 전 Map에 대응시켜 로그인 해보겠습니다.
	Map<String,String> login = new HashMap<String, String>();
	login.put("hong","1111");

	
	//비교
/* 	String msg;
	if(login.containsKey(id)){
		msg = "아이디가 일치합니다.";
		if( login.get(id).equals(pw)){
			msg = "아이디 , 비밀번호 모두 일치합니다.";
		} else {
			msg = "비밀번호가 다릅니다.";
		}
	} else {
		msg = "아이디가 일치하지 않습니다.";
	}; */
	
	boolean check = false;
	
// 	if(login.containsKey(id)){
// 		if( login.get(id).equals(pw)){
// 			check = !check;
// 		}
// 	}
	//접속정보 불러오기
	//-> 나중에는 디자인 패턴(싱글턴)으로 바꿉니다.
	DBConnection connection = new DBConnection();
	Connection conn = connection.getConn();
	String sql = "SELECT * FROM member WHERE mid =? AND mpw=?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id); //첫번째 물음표 자리에 id 넣기
	pstmt.setString(2, pw); //두번째 물음표 자리에 pw 넣기
	
	ResultSet rs = null;
	rs = pstmt.executeQuery();
	
	String name = null;
	String date = null;//가입일
	int mgrade = 0;//등급
	
	if(rs.next()){//sql문을 통해 온 데이터가 있는지?
		name = rs.getString("mname");//컬럼명
		date = rs.getString("mdate");//가입일
		mgrade = rs.getInt("mgrade");//등급
		check = true;
		
	}
	
%>

화면에 표시 <br>
<%=id %>
<%=pw %>
<% if(check){ %>
<!-- 아이디하고 비밀번호가 일치할 때 -->
<%=name %>님 반갑습니다.<br>
가입일은 <%=date %>입니다.<br>
등급은 <%=mgrade %>등급입니다.
<% } else { %>
<!-- 아이디하고 비밀번호가 일치하지 않을 때 -->
아이디하고 비밀번호가 일치하지 않습니다.<br>
다시 시도해주세요
<a href="./login.jsp">로그인하기</a>
<%} %>

</body>
</html>