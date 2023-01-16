package com.poseidon.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poseidon.db.MemberDAO;
import com.poseidon.db.MemberDTO;

@WebServlet("/edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Edit() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		if(request.getParameter("no") != null) {
			//code
			//수정하기 해당 번호에 맞는 레코드를 불러와야함 =select
			//그 내용을 화면에 출력해 사용자가 이전 정보와 수정할 정보를 한번에 볼 수 있어야 함
			//수정된 내용을 다시 저장  =Update
			String no = request.getParameter("no");
			int member_no = Integer.parseInt(no);
			MemberDAO dao = new MemberDAO();
			MemberDTO dto = dao.selectOne(member_no);
			//System.out.println(dto.getMember_name());
			
//			RequestDispatcher rd = request.getRequestDispatcher("./Edit.jsp");
//				rd.forward(request, response);
				
				PrintWriter pw = response.getWriter();
				pw.print("<html>");
				pw.print("<head>");
				pw.print("<title>출력해보기</title></head>");
				pw.print("<body>");
				pw.print("<form action = '' method = 'post'>");
				pw.print("번호<input type='number' name='no' disabled value='");
				pw.print(dto.getMember_no());
				pw.print("'><br>");
				pw.print("이름<input type='text' name='name' value='"+dto.getMember_name()+"'><br>");
				pw.print("나이<input type='number' name='age' value='"+dto.getMember_age()+"'><br>");
				pw.print("번호<input type='text' name='tel' value='"+dto.getMember_tel()+"'><br>");
				pw.print("이메일<input type='text' name='email' value='"+dto.getMember_email()+"'><br>");
				pw.print("<button type = 'submit'>수정하기</button>");
				pw.print("</form>");
				pw.print("</body>");
				pw.print("</html>");
				pw.close();
		} else {
			response.sendRedirect("./index.jsp");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("sdfsdf");
		response.setCharacterEncoding("UTF-8");
		
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		System.out.println(no);
		System.out.println(name);
		System.out.println(age);
		System.out.println(tel);
		System.out.println(email);
		MemberDTO dto = new MemberDTO();
		dto.setMember_no(Integer.parseInt(no));
		dto.setMember_name(name);
		dto.setMember_age(Integer.parseInt(age));
		dto.setMember_tel(tel);
		dto.setMember_email(email);
		//response.sendRedirect("./index.jsp");
		
		MemberDAO dao = new MemberDAO();
		dao.update(dto);
		response.sendRedirect("./index.jsp");
		
	}

}
