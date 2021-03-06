<%@page import="java.io.PrintWriter"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.sql.*" %>

<%
	request.setCharacterEncoding("EUC_KR");
	//response.setContentType("text/html;charset=EUC_KR");
	//PrintWriter out = response.getWriter();
	
	//Client Form Data 처리
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//============JDBC시작=====================//
	//============JDBC시작=====================//
	//============JDBC시작=====================//
	//DBMS에서 추출한 id, pwd 처리 위한 변수선언
	String fromDbId = null;
	String fromDbPwd = null;
	
	try{
		
		String dburl = "jdbc:oracle:thin@127.0.0.1:1521:xe";
		String dbuser = "scott";
		String dbpwd = "tiger";
		//1단계 Connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
		//2단계 Statement
		PreparedStatement pStmt = con.prepareStatement("SELECT id, pwd From users WHERE id=?");
		
		pStmt.setString(1,id);
		
		//3단계 ResultSet
		ResultSet rs = pStmt.executeQuery();
		
		if(rs.next()){
			fromDbId = rs.getString("id");
			fromDbPwd = rs.getString("pwd");
			//==> debug:console 확인
			System.out.println("db에서 확인 한 id,pwd ==> : "+fromDbId+":"+fromDbPwd);
		}else{
			//==> debug :: console확인
			System.out.println("db client에서 입력한 <"+id+">와<"+pwd+">가 없습니다.");
		}
		//각각의 JDBC 관련 인스턴스 close;
		rs.close();
		pStmt.close();
		con.close();
	
	
	}catch(Exception e){
		System.out.println("==>JDBC 관련 Exception이 발생한 모양 <==");
		e.printStackTrace();
	}

%>

<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>Login 화면</h2>
	<!-- DBMS Data 와 Client Form Data 비교 회원유무 판단 -->
	<% if(fromDbId != null && fromDbPwd != null && fromDbId.equals(id) && fromDbPwd.equals(pwd))
	{%>
	<%=id %>님 환영합니다.
	<%}else {%>
	id.pwd를 확인하세요.
	<%} %>
	
	<p/><p/><a href='/edu/jw07/loginJSP.html'>뒤로</a>
</body>

</html>