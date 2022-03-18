package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.HtmlServlet;





public class LoginBeanVODao extends HtmlServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Client Form Data 처리
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		//UserVO instance 생성 및 Client Form Data 전달(Binding)
		UserVO userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		//DB 접근 Data 검색 비교 UserVO.action true /false 변경
		UserDao useDao = new UserDao();
		useDao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()) {
			out.println(id+"님 환영합니다.");
		}else {
			out.println("Login 실패 id,pwd를 확인하세요.");
		}
		
		out.println("<p><p><a href='/edu/jw04/loginBeanVODao.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
