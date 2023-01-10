package com.poseidon.db;
//데이터베이스 접속 정보

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public Connection getConn() {
		Connection conn = null;
		//DB정보
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://wisejia.iptime.org:3306/springreference";
			String id = "springreference";
			String pw = "01234567";
			conn = DriverManager.getConnection(url,id,pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
