//package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKr extends HttpServlet{
	//1. Client Get 방식으로 Request :: doGet() method O/R
	//2. service() O/R 가능
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		/*===========================================================
		 * ==> Tomcat 8.x이상 Get 방식 한글 해결방법
		 * ==> servev.xml 설정 변경
		 * <Connector port="8080" protocol="HTTP/1.1"
		 * 		connectionTimeout="20000"
		 * 		redirectPort="8443"
		 * 		useBodyEncodingForURI="true"/> <== 추가
		 * ==========================================================
		 */
		req.setCharacterEncoding("EUC_KR");
		//아래의 두실행문은 servlet에서 client로 html을 전송시 필수 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client form data(QueryString::name=value)처리(API확인)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//client form data 출력(출력은??)
		System.out.println(clientName+":"+clientAddr);
		
		/*===========================================================
		 * ==> Tomcat 7.x이하 Get 방식 한글 해결방법
		 * 16진수 인코딩된 client form data 한글 디코딩
		 * String clientNameKo = this.convertKo(clientName);
		 * String clientAddrKo = convertKo(clientAddr);
		 *client form data 출력(출력은??)
		 *System.out.println(clientNameKo+":"+clientAddrKo);
		 * ==========================================================
		 */
		
		out.println("<html>");
		out.println("<head><title>GetDataKr.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li>이름: "+clientName);
		out.println("<li>주소 : "+clientAddr);
		
		out.println("<p><p><a href='/edu/GetDataKr.html'>뒤로</a>");
		
		out.println("</body>");
		out.println("</html>");
	}
	
	/*===========================================================
	 * ==> Tomcat 7.x이하 Get 방식 한글 해결방법
	 * Method
	 * private String convertKo(String paramValue){
	 * 		String convertParamValue = null;
	 * 		try{
	 *		==> API확인
	 *			byte[] b = paramValue.getBytes("8859_1");
	 *			convertParamValue = new String(b,"EUC_KR");
	 * 		}catch(UnsupportedEncodingException uee){
	 * 			System.out.println("한글 변환중 Exception 발생");
	 * 			uee.printStackTrace();
	 * 		}
	 * 		return convertParamValue;
	 * }
	 * ==========================================================
	 */
}
