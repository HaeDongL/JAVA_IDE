<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	//::���尴ü : request,session,out,application ���
	//::Scriptlet, Expression Tag ���� ��� ����
	
	//1.request Object Scope "count" ����.
	Integer count =(Integer)request.getAttribute("count");

	//2.���ٸ�...
	//==> name : "count" value : new Integer(1);
	if(count == null){
		out.println(":: 1��° Request::");
		request.setAttribute("count", new Integer(1));
	}
	
	//3. �ִٸ�
	//==> requets ObjectScope ������ ���
	//==> count ���� ����(+1) �ٽ� request ObjectScope ����
	else{
		int changeCount = count.intValue()+1;
		out.println("::"+changeCount+"��° Request::");
		
		request.setAttribute("count", new Integer(changeCount));
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