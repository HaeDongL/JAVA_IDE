package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileNme: Login.java
 */

public class Login extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Client Form Data 처리
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		//======================================================//
		//=================JDBC시작==============================//
		//======================================================//
		
		//DBMS 에서 추출한 id,pwd 처리 위한 변수선언
		String fromDbId = null;
		String fromDbPwd = null;
		
		try {
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbuser = "scott";
			String dbpwd = "tiger";
			
			//1단계 Connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			//2단계 Statement
			PreparedStatement pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
			pStmt.setString(1, id);
			ResultSet rs = pStmt.executeQuery();
			if(rs.next()) {
				fromDbId = rs.getString("id");
				fromDbPwd = rs.getString("pwd");
				//==> debug::console 확인
				System.out.println("db에서 확인 한 id,pwd ==>"+fromDbId+":"+fromDbPwd);
			}else {
				//==> debug :: console 확인
				System.out.println("db에 client에서 입력한 <"+id+">와<"+pwd+">가 없습니다.");
			}
			
			//각각의 JDBC관련 인스턴스 close
			rs.close();
			pStmt.close();
			con.close();
			
			
		}catch(Exception e) {
			System.out.println("===> JDBC 관련 Exception이 발생한 모양<==");
			e.printStackTrace();
		}
		
		//======================================================//
		//=================JDBC관련 부분 종료...====================//
		//======================================================//
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login화면</h2>");
		
		//DBMS Data 와 Client Form Data 비교 회원유무 판단
		
		if(fromDbId != null && fromDbPwd != null &&
				fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
			out.println(id+"님 환영합니다.");
		}else {
			out.println("id,pwd를 확인하세요.");
		}
		
		out.println("<p><p><a href='/edu/jw04/login.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
		
		
		
		
		
	}
}
