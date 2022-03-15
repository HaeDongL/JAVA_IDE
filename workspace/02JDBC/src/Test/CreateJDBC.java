package Test;

import java.sql.*;

public class CreateJDBC {

	/*
	 * FileName: CreateJDBC.java
	 * 1.JDBC Programming ����
	 * 2.������ JDBC Programming ���� ���� �߻��ϴ� Exception ����
	 * 3.excuteQuery(SQL),executeUpdate(SQL)Method ����
	 */
	
	//main
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		//1. Connection :: Login ������ �߻�ȭ�� interface
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // �ش� ����̹��� ����ϰڴٴ� �ǹ�.
			System.out.println("1.driver login OK");
		
			con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("2.connection �ν��Ͻ� ���� �Ϸ�");
			
			stmt = con.createStatement();
			System.out.println("3.statement��ü ���� �Ϸ�");
			//Create Query �����
			String createSql=
					"CREATE TABLE firstJDBC"+
							"(no		NUMBER(3),"+
							"name		VARCHAR2(20),"+
							"email		VARCHAR2(30),"+
							"address	VARCHAR2(50))";
			
			System.out.println("::QUERY ���۰�� : "+stmt.executeUpdate(createSql));
			System.out.println("4.query���ۿϷ�");
			
		}catch(ClassNotFoundException e) {
			System.out.println("\n==>Driver Loading�� Exception �߻� \n");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("\n==>JDBC ���� �� Exception �߻� : "+e.getErrorCode());
			e.printStackTrace();
			//2.Statement::Query ������ �߻�ȭ�� interface
		}finally {
			try {if(stmt != null) stmt.close();} catch(Exception e) {}
			try {if(con != null)con.close();} catch(Exception e) {}
		}
		
		
	}

}