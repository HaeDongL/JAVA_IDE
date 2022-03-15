

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example01 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver 로딩 완료");
		String sql = "CREATE TABLE member("
				+ "no NUMBER,"
				+ "id VARCHAR2(10),"
				+ "pwd VARCHAR2(10))";
		
		con = DriverManager.getConnection(url,"scott","tiger");
		stmt = con.createStatement();
		System.out.println("::QUERY 전송결과"+stmt.executeUpdate(sql));
		System.out.println("전송 완료");
		
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("sql 실행중 오류");
			e.printStackTrace();
		}finally {
			try{if(con!=null) con.close(); if(stmt!=null) stmt.close();}catch(Exception e) {}
		}
	}

}
