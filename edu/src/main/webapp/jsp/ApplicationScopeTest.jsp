<%@page import="java.util.Set"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	//: ���尴ü : request,session,out,application ���
	//: Scriptlet, Expression Tag ���� ��밡��
	
	//1.application Object Scope "count" ����
	Integer count = (Integer)application.getAttribute("count");
	
	//2.���ٸ�...
	//==> nmae : "count" value : new Integer(1)
	if(count == null){
		out.println("::�ش� ������ 1��° ���::");
		application.setAttribute("count", new Integer(1));
	}
	
	//3. �ִٸ�...
	//==> application ObjectScope ������ ���
	//==> count ���� ���� (+1) �ٽ� allication ObjectScope ����
	else{
		int changeCount = count.intValue();
		out.println(":: �ش� ������ "+changeCount+"��° ���::");
		
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