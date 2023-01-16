package com.poseidon.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poseidon.db.MemberDAO;
import com.poseidon.db.MemberDTO;


@WebServlet(description = "wirte something", urlPatterns = { "/write" })
public class Write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Write() {//Operator
        super(); //부모 생성자 호출

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get로 들어왔음");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//post방식은 여기로 들어옵니다.
	//리퀘스트, 리스폰스
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글처리
		request.setCharacterEncoding("UTF-8");
		//doGet(request, response);
		System.out.println("Post로 들어왔음");
		//값 받기 name , tel ,age, email
		String name = request.getParameter("name");
		//String age = request.getParameter("age");
		String tel = request.getParameter("tel");		
		String email = request.getParameter("email");
		System.out.println("name :" + name);
		System.out.println("age :" + request.getParameter("age"));
		System.out.println("tel :" + tel);
		System.out.println("email :" + email);
		//들어오는 값 확인 했으니, DB에 저장하기
		MemberDTO dto = new MemberDTO();
		dto.setMember_name(name);
		dto.setMember_age(Integer.parseInt(request.getParameter("age")));
		dto.setMember_tel(tel);
		dto.setMember_email(email);
		MemberDAO dao = new MemberDAO();
		int result = dao.insert(dto);
		System.out.println("결과 : " + result); //결과값 출력
		
		//MVC = Model(DB ,값), View(jsp), Controller(java)
		response.sendRedirect("./index.jsp");
	}

}
