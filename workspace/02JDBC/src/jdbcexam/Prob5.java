package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Prob5 {
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("부서의 아이디를 입력하세요...");
			System.exit(1);
		}
		String dept_id = args[0];
		
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String password = "hr";
//		String sql = "SELECT\r\n"
//				+ "e.employee_id, d.department_name, e.salary, AVG(e.salary)\r\n"
//				+ "FROM employees e, departments d\r\n"
//				+ "WHERE e.department_id = d.department_id\r\n"
//				+ "AND d.department_id = "+args[0]+"\r\n"
//				+ "GROUP BY e.employee_id, d.department_name, e.salary";\
		
		String sql = "SELECT\r\n"
		+ "e.employee_id, d.department_name, e.salary, AVG(e.salary)\r\n"
		+ "FROM employees e, departments d\r\n"
		+ "WHERE e.department_id = d.department_id\r\n"
		+ "AND d.department_id = ?\r\n"
		+ "GROUP BY e.employee_id, d.department_name, e.salary";
		con = DriverManager.getConnection(url,user,password);
		//stmt = con.createStatement();
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,Integer.parseInt(args[0]));
		rs = pstmt.executeQuery();
		
		rsmd = rs.getMetaData();
		System.out.println(rsmd.getCatalogName(0)+"\t"+rsmd.getCatalogName(0)+"\t"
		+rsmd.getCatalogName(0)+"\t"+rsmd.getCatalogName(0)+"\t");
		while(rs.next()) {
			System.out.println(rs.getInt("employee_id")+"\t"+rs.getString("department_name")+"\t"
		+rs.getInt("salary")+"\t"+rs.getInt("AVG(e.salary)"));
			
		}
		
		
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("SQL 에러");
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {con.close();} catch(Exception e) {}
			}
			if(pstmt != null) {
				try {pstmt.close();} catch(Exception e) {}
			}
			if(rs != null) {
				try {rs.close();} catch(Exception e) {}
			}
		}
	}
	
}
