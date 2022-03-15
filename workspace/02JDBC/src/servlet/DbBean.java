package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
	 * FileName : DbBean.java
	 */
public class DbBean {
	//Field
	private String dburl = "jdbc:oracle:thin:@127.0.0.1:xe";
	private String dbuser = "scott";
	private String dbpwd = "tiger";
	private String id;
	private String pwd;
	
	//Constructor
	public DbBean() {
		
	}
	//Method
	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	//DB접근 Data검색 비교 true/false return
	
	public boolean getUser() {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			//1단계 Connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			//2단계 Statment
			pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
			pStmt.setString(1,id);
			
			//3단계 resultSet
			rs = pStmt.executeQuery();
			String str = null;
			
			if(rs.next()){
				str = rs.getString("pwd");
				//==> debug :: console 확인
				System.out.println("db에서 확인 한 id,pwd ==> : "+id+":"+str);
			}else {
				//==> debug::console 확인
				System.out.println("db에<"+id+">에 해당하는 자료가 없습니다.");
			}
			
			//회원 유무를 확인하고, 회원이면 true, 아니면 false return
			
			if(str != null && str.equals(pwd)) {
				return true;
			}else {
				return false;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			//<== 왜 catch문 내부에 return 문이 존재해야 하는가??????
			return false;
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				}catch(Exception e) {}
			}
			
			if(pStmt!=null) {
				try {
					pStmt.close();
				}catch(Exception e) {}
			}
			
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e) {}
			}
		}
	}
	
	
	
	
	
}
