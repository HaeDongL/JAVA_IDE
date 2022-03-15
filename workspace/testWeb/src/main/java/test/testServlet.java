package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/testServlet")
public class testServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = response.getWriter();
		String name = null;
		String[] values = null;
		Enumeration<String> en = request.getParameterNames();
		
		out.println("<html>");
		out.println("<head><title>��������</title></head>");
		out.println("<body>");
		out.println("<ul>");
		while(en.hasMoreElements()) {
			name = en.nextElement();
			values = request.getParameterValues(name);
			for(int i=0;i<values.length;i++){
				out.println("<li>"+name+" "+values[i]);
			}
		}
		out.println("<ul>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
	}

}
