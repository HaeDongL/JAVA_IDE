package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : LoginBeanSource.java
 * ::Connecton Pool �� �̿��� SPECȭ �� javax.sql.DataSource���
 */

//@WebServlet("/LoginBeanDataSource")

public class LoginBeanDataSource extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,
	IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/http;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Client Form Data ó��
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		//UserVO instance  ���� �� Client Form Data ���� (Binding)
		UserVO userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		//DB���� Data �˻��� UserVO.active true / false ����
		userDataSourceDao userDataSourceDao = new UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login</h2>");
		
		if(userVO.isActive()) {
			out.println(id+"�� ȯ���մϴ�.");
		}else {
			out.println("Login ���� id,pwd�� Ȯ���ϼ���.");
		}
		
		out.println("<p><p><a href='/edu/jw04/loginBeanDataSource.html>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}

}