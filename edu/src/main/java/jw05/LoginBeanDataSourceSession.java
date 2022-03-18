package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw04.UserDataSourceDao;
import jw04.UserVO;

/**
 * Servlet implementation class LoginBeanDataSourceSession
 */
//@WebServlet("/LoginBeanDataSourceSession")
public class LoginBeanDataSourceSession extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,
	IOException{
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Client Form Data ó��
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		//session ����Ȯ�� :: ���ο� HttpSession ���� OR ���� HttpSession GET
		HttpSession session = req.getSession(true);
		
		// �� login �� ȸ�� :: session�� ����� UserVO Get
		// �� login �� ȸ�� :: session�� ����� UserVO �����Ƿ� null Get
		
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session�� ����� UserVO ���� Ȯ�� : "+userVO);
		
		// �Ʒ��� �� ��츦 ����
		//==> ������ ���� 1
		//:: loginBeanPoolSession.html�� ��ó��(?) dhsms ruddn
		//1. id�� �Է����� ���� ��� :: req.getParameter("id")�� �� ==> ""(NullString)
		
		//==> ������ ���� 2
		//:: Browser �ּ�â�� ���� URl
		//	http://127.0.0.1:8080/edu/LoginBeanDataSourceSession �Է��� ���
		// 2.req.getParameter("id")�� �� ==> null
		
		//==> 1,2 �� ��� DB ���� ���ʿ� :: �Է� ���� ��ȿ���� check �ϴ� if ��.
		if(!(id==null||id.equals(""))) {
			//UserVO instance ���� �� Client Form Data ���� (Binding)
			userVO = new UserVO();
			userVO.setId(id);
			userVO.setPwd(pwd);
			
			//DB ���� Data �˻� �� UserVO.active true/false ����
			UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
			userDataSourceDao.getUser(userVO);
			
		}
		
		out.println("<html>");
		out.println("<head></head");
		out.println("<body>");
		out.println("<h2>Login ȭ��</h2>");
		
		if(userVO != null && userVO.isActive()) {
			out.println(userVO.getId()+"�� ȯ���մϴ�.");
			//Login �� ���������� �̷���� ���
			//:: session �� �α��� ������ userVO instance ����
			session.setAttribute("userVO",userVO);
		}else {
			out.println("Login ���� id,pwd�� Ȯ���ϼ���.");
		}
		
		out.println("<p><p><a href='/edu/jw05/loginBeanDataSourceSession.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}

}