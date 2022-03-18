<%@page import="jw04.UserDataSourceDao"%>
<%@ page contentType="text/html; charset=EUC-KR"%>

<%
	request.setCharacterEncoding("EUC_KR");
	response.setContentType("text/html;charset=euc_kr");
	//PrintWriter out = response.getWriter();
	
	//Client Form Data 처리
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//session 유무 확인 :: 새로운 HttpSession 생성 OR 기존 HttpSession GET
	//HttpSession session = req.getSession(true);
	
	// 기 login 한 회원 :: session 에 저장된 UserVO Get
	// 미 login 한 회원 :: session 에 저장된 UserVO 없으므로 null Get
	jw04.UserVO userVO = (jw04.UserVO)session.getAttribute("userVO");
	System.out.println("session에 저장된 UserVO 유무 확인 : "+userVO);
	
	//아래의 두 경우를 고려
	//==> 고려할 사항 1
	//::loginBeanPoolSession.html 을 거쳐서(?) 오는경우
	//1.id 를 입력하지 않은 경우 :: req.getParameter("id")의 값 ==? ""(NullString)
			
	//==> 고려할 사항 2
	//:: Browser 주소창에 직접 URL
	// html://127.0.0.1:8080/edu/LoginBeanDataSourceSession 입력한 경우
	//2.req.getParameter("id")의 값 ==> null
	
	//==> 1,2인 경우 DB접근 불필요 :: 입력 값의 유혀성을 check 하는 if 문.
	
	if(!(id==null || id.equals("")) ){
		//UserVO instance 생성 및 Client Form Data 전달(Binding)
		userVO = new jw04.UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		//DB 접근 Data 검색 비교 UserVO.active true/false 변경
		UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
	}
%>

<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%if(userVO != null && userVO.isActive()){ %>
	<%= userVO.getId() %>님 환영합니다.
	<%
		// Login이 정상적으로 이루어진 경우
		//:: session 에 로그인 정보 userVO instance 저장
		session.setAttribute("userVO", userVO);
	%>
	<%}else {%>
		Login 실패 id,pwd를 확인하세요.
		<%} %>
		<p/><p/><a href='/edu/jw07/loginBeanDataSourceSessionJSP.html'>뒤로</a>
</body>
</html>