package sbu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/07/25
 * 이름 : 이준우
 * 내용 : JDBC 실습하기
 * 
 */

public class UpdateTest {
	
	public static void main(String[] args) {
		
	
		// DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "rainbow0oo0";
		String pass = "1234";
				
		try {
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "UPDATE USER1 SET AGE=35 WHERE USER_ID='J101'";
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		System.out.println("Update 완료...");
		
	}	

}
