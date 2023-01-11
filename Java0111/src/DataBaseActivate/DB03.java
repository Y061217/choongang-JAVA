package DataBaseActivate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DB03 {
	private void insert(int no , String name , String id) {
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConn();
		Statement stmt = null;
		String sql = "INSERT INTO member values("+no+",'"+name+"','"+id+"')";
		
		try {
			stmt = con.createStatement();
			stmt.execute(sql);
			System.out.println("저장 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		DB03 db = new DB03();
		db.insert(2, "오늘 규동", "쩔었다");
		
	}
}
