package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * FileName: UserInitParamDao
 * ::특정DBMS에 종속적이지 않은 DAO
 */

public class UserInitParamDao {
	//Field
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;
	
	//Constructor
	public UserInitParamDao() {
		
	}
	//Method
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}

	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}

	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}

	public void setJdbcPasswd(String jdbcPasswd) {
		this.jdbcPasswd = jdbcPasswd;
	}
	
	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			//1단계 Connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(jdbcURL,jdbcUser,jdbcPasswd);
			
			//2단계 Statment
			pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
			
			//3단계 resultSet
			rs = pStmt.executeQuery();
			if(rs.next()) {
				System.out.println("db에서 확인 한 id,pwd ==>:"+userVO.getId()+":"+userVO.getPwd());
				//==>Data 가 존재 한다면...
				userVO.setActive(true);
			}
		}catch (Exception e) {
			e.printStackTrace();
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
