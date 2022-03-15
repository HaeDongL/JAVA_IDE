package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HtmlServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");
		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String clientName = req.getParameter("name");
		String clientGen = req.getParameter("gender");
		String clientYear = req.getParameter("year");
		String clientMonth = req.getParameter("month");
		String clientDay = req.getParameter("day");
		String clientJob = req.getParameter("job");
		String cellPhone01 = req.getParameter("cellphone01");
		String cellPhone02 = req.getParameter("cellphone02");
		String cellPhone03 = req.getParameter("cellphone03");
		String clientAddr = req.getParameter("addr");
		
		System.out.println(req.getParameter("cellphone01"));

		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"EUC_KR\"");
		out.println("<title>HtmlServlet.html</title>");
		out.println("<body>");
		out.println("<ul>\r\n"
				+ "	<li>이름: "+clientName+"\r\n"
				+ "	<li>성별: "+clientGen+"\r\n"
				+ "	<li>생년월일: "+clientYear+"년"+clientMonth+"월"+clientDay+"일\r\n"
				+ "	<li>직업: "+clientJob+"\r\n"
				+ "	<li>휴대폰: "+cellPhone01+"-"+cellPhone02+"-"+cellPhone03+"\r\n"
				+ "	<li>주소: "+clientAddr+"\r\n"
				+ "</ul>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.flush();
		out.close();
	}
	
}
