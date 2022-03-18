//package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 * FileName : HelloServletdoPost.java
 * Servlet Life Cycle 이해 및 적용 구현
 * Servlet Hierarchy / Servlet API 이해
 */


public class HelloServletdoPost extends HttpServlet{
	
	// init() ==> 금번 예제 method overriding on need
	
	//service() method Overriding 않음
	
	//doPost() method Overrding
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		this.doPost(req,res);
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			
			System.out.println("::servlet doPost() 시작");
			System.out.println("Request Client IP : "+req.getRemoteAddr());
			
			//한글처리
			res.setContentType("text/html;charset=EUC-KR");
			
			//PrintWriter 인스턴스 생성을 Encapsulation 한 API 사용 Stream 생성
			PrintWriter out = res.getWriter();
			
			out.println("<html>");
			out.println("<head><title>hello Servlet</title></head>");
			out.println("<body>");
			out.println("English : HelloServlet");
			out.println("<p>");
			out.println("Korea : 헬로 서블릿");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
			
			System.out.println("::servlet doPost 종료\n");
	
		}//end of service
}
