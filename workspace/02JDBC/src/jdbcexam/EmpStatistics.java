package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpStatistics {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void printStatistics(int maxSalary) throws SQLException {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		String sql = null;
		System.out.println("===================================");
		System.out.println("Max Salary : " + maxSalary);
		System.out.println("===================================");
		con = DriverManager.getConnection(url, "hr", "hr");
		//stmt = con.createStatement();
		sql = "SELECT "
				+ "j.job_title, AVG(e.salary) "
				+ "FROM jobs j, employees e "
				+ "WHERE e.job_id = j.job_id "
				+ "GROUP BY j.job_title "
				+ "HAVING AVG(e.salary) >= "+maxSalary+
				" ORDER BY AVG(e.salary) DESC";
		pstmt = con.prepareStatement(sql);
		res = pstmt.executeQuery(sql);
		while(res.next()) {
			System.out.println("["+res.getString("job_title")+"] "+res.getInt("AVG(e.salary)"));
			
		}
		con.close();
		pstmt.close();
		res.close();
	}

	public static void main(String[] args) throws Exception {
		int maxSalary = 10000;
		new EmpStatistics().printStatistics(maxSalary);

		maxSalary = 15000;
		new EmpStatistics().printStatistics(maxSalary);

	}

}
