package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.pool.OracleConnectionPool;



/*
 * FileName : UserPoolDao.java
 * ::JDBC 절차 중 Connection 인스턴스 생성 및 관리 전담하는 Connection Pool 사용
 */

public class UserPoolDao {
	
	//Field
	//String dburl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//String dbuser="scott";
	//String dbpwd = "tiger";
	
	//Constructor
	public UserPoolDao() {
	}
	
	//Method
	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			//1단계 Connection
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			
			//==>OracleConnectionPool로 부터 Connecton 인스턴스 Get
			con = OracleConnectionPool.getInstance().getConnection();
			//2단계 Statement
			pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());
			
			//3단계 resultSet
			rs = pStmt.executeQuery();
			if(rs.next()) {
				System.out.println("db에서 확인 한 ip,pwd ==> : "+userVO.getId()+":"+userVO.getPwd());
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
