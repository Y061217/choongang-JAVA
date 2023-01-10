<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<title>글쓰기</title>

</head>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<style>
.textbx {
	maring: 0;
	width: 600px;
	height: 720px;
	background-color: #cfcfcf;
	padding: 5px;
	box-sizing: border-box;
}

.textbx input {
	width: 100%;
	height: 30px;
}

.textbx textarea {
	width: 100%;
	height: 640px;
}

.textbx button {
	width : 100%;
	height: 30px;
	line-height: 15px;
	
}
</style>
<body>
	<div class="textbx">
		<form action="./wirteAction.jsp">
			<input type="text" name="title" placeholder="제목을 입력하세요"><br>
			<textarea name="content"  placeholder="이곳에 내용을 입력하세요"></textarea><br>
			<button type="submit" class="btn btn-success" onclick="loaction.href='./wirteAction.jsp'">전송</button>
		</form>
	</div>
</body>
</html>