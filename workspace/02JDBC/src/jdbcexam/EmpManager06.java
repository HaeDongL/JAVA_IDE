package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager06 {



	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void printEmployee(String city,int lo, int hi) throws SQLException {
		Connection conn = null;
		//Statement stmt = null;
		ResultSet res = null;
		PreparedStatement pstmt = null;
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		conn = DriverManager.getConnection(dburl,"hr","hr");
//		String sql = "SELECT\r\n"
//				+ "e.first_name, d.department_name\r\n"
//				+ "FROM employees e, departments d, locations l\r\n"
//				+ "WHERE e.department_id = d.department_id\r\n"
//				+ "AND d.location_id = l.location_id\r\n"
//				+ "AND l.city = '"+city+"' \r\n"
//				+ "AND e.salary BETWEEN "+lo+" AND "+hi;
		String sql = "SELECT\r\n"
				+ "e.first_name, d.department_name\r\n"
				+ "FROM employees e, departments d, locations l\r\n"
				+ "WHERE e.department_id = d.department_id\r\n"
				+ "AND d.location_id = l.location_id\r\n"
				+ "AND l.city = ? \r\n"
				+ "AND e.salary BETWEEN ? AND ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, city);
		pstmt.setInt(2, lo);
		pstmt.setInt(3, hi);
		
		res = pstmt.executeQuery();
		while(res.next()) {
			System.out.println(res.getString("first_name")+"\t"+res.getString("department_name"));
		}
		conn.close();
		pstmt.close();
		res.close();
		
	}
	
	public static void main(String[] args) throws SQLException{
		
		new EmpManager06().printEmployee("South San Francisco",7000,10000);

	}
}
