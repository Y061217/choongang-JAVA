package DataBaseActivate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//자바와 데이터베이스 연결


//SQL 명령어 기본
//SELECT 조회, 불러오기
//INSERT 저장
//UPDATE 수정
//DELETE 삭제


public class DB01 {
public static void main(String[] args) {
	//DB와 연결 -> jar와 연결
	Connection con = null; //접속정보 저장
	Statement stmt = null; //실제 접속 정보로 db에서 일하기
	ResultSet rs = null; //결과값 저장
	
	String url = "jdbc:mariadb://localhost:3306/poseidon";
	String id = "poseidon";
	String pw = "01234567";
	
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		con = DriverManager.getConnection(url,id,pw);
		stmt = con.createStatement();
		System.out.println("접속 성공");
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버가 없습니다.");
		e.printStackTrace();
	} catch (SQLException e) {		
		System.out.println("접속정보에 문제가 있습니다.");
		e.printStackTrace();
	}
	
	
	
}	
}
