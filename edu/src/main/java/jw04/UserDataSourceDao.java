package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

/*
 * FileName : UserDataSourceDao.java
 * ::Connection Pool 을 SPEC화 한 javax.sql.DataSource 사용
 */

public class UserDataSourceDao {
	//Field
	//String dburl = "jdbc:oracle:thin:@127.0.0.1521:xe";
	//String dbuser = "scott";
	//String dbpwd = "tiger;
	
	//Constructor
	public UserDataSourceDao() {
		
	}
	
	//Method
	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			//1단계 Connection
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			//==>OracleConnectionPool로 부터 Connection 인스턴스 받기
			//con = OracleConnectionPool.getInstance().getConnection();
			
			//====================================================//
			//==> DataSource에서 connection GET
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
												//==> java:comp : naming service root
												//==> env:envirment
												//==> jdbc/ora : server.xml에 등록된 name
			con = ds.getConnection();
			//=====================================================//
			
			//2단계 statement
			pStmt = con.prepareStatement("select id, pwd from users where id=? and pwd=?");
			pStmt.setString(1,userVO.getId());
			pStmt.setString(2,userVO.getPwd());
			
			rs = pStmt.executeQuery();
			if(rs.next()) {
				System.out.println("db에서 확인 한 id,pwd ==> : "+userVO.getId()+":"+userVO.getPwd());
				//==> Data가 존재 한다면...
				userVO.setActive(true);
			}else {
				System.out.println("db에 <"+userVO.getId()+">에 해당하는 자료가 없습니다.");
			}
		}catch(Exception e) {
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
