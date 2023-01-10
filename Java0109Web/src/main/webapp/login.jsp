<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인하기</title>
</head>
<body>
<!-- 자바 : 입출력, 네트워킹, 그래픽, 쓰래드 -->
	<form action = "./loginAction.jsp" method = "post">
		<input type="text" name = "id">
		<input type="password" name = "pw">
		<button type="submit">로그인</button>
		<button type="reset">초기화</button>
	</form>
</body>
</html>