package com.poseidon.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poseidon.db.MemberDAO;
import com.poseidon.db.MemberDTO;

@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Delete() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//숫자가 들어오는 지 확인
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String no = request.getParameter("no");
		int member_no = Integer.parseInt(no);
		
		MemberDTO dto = new MemberDTO();
		dto.setMember_no(member_no);
		MemberDAO dao = new MemberDAO();
		int result = dao.delete(dto);
		System.out.println(result);
		response.sendRedirect("./index.jsp");
				
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
