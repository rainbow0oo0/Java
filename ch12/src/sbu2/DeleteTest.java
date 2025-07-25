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

public class DeleteTest {
	
	public static void main(String[] args) {
		// DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "rainbow0oo0";
		String pass = "1234";
		
		try {
			// 데이터베이스 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "DELETE FROM USER1 WHERE USER_ID='J102'";
			stmt.executeUpdate(sql);
			
			// 결과처리(SELECT일 때)
			
			// 데이터베이스 종료
			stmt.close();
			conn.close();			
			
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		System.out.println("Delete 완료...");
	}

}

