package com.poseidon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poseidon.db.DBConnection;

//DAO Data Access Object
//DTO , VO도 있음
public class BoardDAO {
	//글쓰기 메소드
	public void write(String title , String content){
		//DB접속
		DBConnection dbConnection = new DBConnection();
		Connection conn = dbConnection.getConn();
		String sql = "INSERT INTO multiboard (mb_title , mb_content , mb_cate , mno) VALUES(?,?,1,1)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.execute();
			System.out.println("저장완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
