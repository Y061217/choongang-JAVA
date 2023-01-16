<%@page import="com.poseidon.db.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.poseidon.db.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 불러오기</title>
<script>
function del(no){
	//alert("삭제를 클릭했습니다.");
	if(confirm("삭제하시겠습니까?")){
		//'예' 눌렀을 경우
		alert("확인을 클릭했습니다.")
		location.href="./delete?no="+no;
	} else {
		//'아니오' 눌렀을 경우
		alert("취소를 클릭했습니다.")
	}
	
}


function edit(no){

	if(confirm("수정하시겠습니까?")){
		//'예' 눌렀을 경우
		alert("확인을 클릭했습니다.")
		location.href="./edit?no="+no;

	} else {
		//'아니오' 눌렀을 경우
		alert("취소를 클릭했습니다.")
	}
	
}
</script>
</head>

<body>
	
	회원 정보
	<%
	MemberDAO dao = new MemberDAO();
	List<MemberDTO> list = dao.list();
	
	%>
	데이터 : <%=list.size() %>
	<table border = 1>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>나이</th>
			<th>전화번호</th>
			<th>email</th>
			<th>삭제</th>
			<th>수정</th>
		</tr>
		<tr>
		<%
		
		for(int i = 0; i < list.size(); i++){
			MemberDTO dto = list.get(i);//memberDTO			
		
		%>
		</tr>
		<tr>
			<td><%=dto.getMember_no() %></td>
			<td><%=dto.getMember_name() %></td>
			<td><%=dto.getMember_age() %></td>
			<td><%=dto.getMember_tel() %></td>
			<td><%=dto.getMember_email() %></td>
			<td><img alt="삭제" src="./delete_icon.png" title = "클릭하면 삭제합니다" onclick = "del(<%=dto.getMember_no() %>)"></td>
			<td><img alt="수정" src="./edit_icon.png" title = "클릭하면 수정합니다" onclick = "edit(<%=dto.getMember_no() %>)"></td>
			<%
		}
		%>
		</tr>
		
	</table>
	<hr>
	<form action = "./write" method = "post">
		이름 : <input type = "text" name = "name" maxlength="5">
		나이 : <input type = "number" name = "age" min="0" max="100">
		전화번호 : <input type = "text" name = "tel">
		email : <input type = "text" name = "email">
		<button type="reset">지우기</button>
		<button type="submit">보내기</button>
	</form>
</body>
</html>