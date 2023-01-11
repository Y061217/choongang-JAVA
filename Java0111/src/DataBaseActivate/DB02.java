package DataBaseActivate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class DB02 {

	public static void main(String[] args) {
		DBConnection dbc = new DBConnection();
		Connection conn = dbc.getConn();//접속정보
		Statement stmt = null;//실제 일 하는 객체
		String sql = "SELECT * FROM member";//쿼리문장
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int number = rs.getInt(1);
				String name = rs.getString(2);
				String id = rs.getString(3);
				System.out.printf("%d \t %s \t %s \n",number,name,id);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}
