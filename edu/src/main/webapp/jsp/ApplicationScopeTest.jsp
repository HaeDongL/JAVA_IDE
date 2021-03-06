<%@page import="java.util.Set"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	//: 내장객체 : request,session,out,application 등등
	//: Scriptlet, Expression Tag 에서 사용가능
	
	//1.application Object Scope "count" 추출
	Integer count = (Integer)application.getAttribute("count");
	
	//2.없다면...
	//==> nmae : "count" value : new Integer(1)
	if(count == null){
		out.println("::해당 페이지 1번째 출력::");
		application.setAttribute("count", new Integer(1));
	}
	
	//3. 있다면...
	//==> application ObjectScope 추출한 출력
	//==> count 값을 증가 (+1) 다시 allication ObjectScope 저장
	else{
		int changeCount = count.intValue();
		out.println(":: 해당 페이지 "+changeCount+"번째 출력::");
		
		application.setAttribute("count", new Integer(changeCount));
	}
%>


<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>