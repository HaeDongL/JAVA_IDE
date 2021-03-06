package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager {
		
		static {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public void printEmployee(String name, int salary) throws SQLException {
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dburl,"hr","hr");
			Statement stmt = null;
			ResultSet res = null;
			/*이곳에 프로그램을 완성하십시오.*/
			String url = null;
			url = "SELECT "
					+ "employee_id, first_name, salary "
					+ "FROM employees "
					+ "WHERE first_name LIKE '"+name+"%' or first_name LIKE '%"+name+"%' "
					+ "AND salary >= "+salary;
			stmt = conn.createStatement();
			res = stmt.executeQuery(url);
			while(res.next()) {
				System.out.println(res.getInt("employee_id")+" "+res.getString("first_name")+" "+res.getInt("salary"));
			}
			
		}
		
		
	public static void main(String[] args) throws SQLException{
		new EmpManager().printEmployee("al",4000);
	}

}
