<%@ page contentType="text/html; charset=EUC-KR""%>

<html>
<head>
</head>
<body>
:: 06JSPActionIncludeParam.jsp <br/>

<%
	//Scriptlet tag ���� ���� :: service()Method local variable
	String value = "local variable";

	//request.session.application ObjectScope Data ����
	request.setAttribute("aaa",new String("request ObjectScope ����� ���ڿ�"));
	session.setAttribute("bbb",new String("session ObjectScope ����� ���ڿ�"));
	application.setAttribute("ccc",new String("application ObjectScope ������ ���ڿ�"));
%>

<!-- Expression Tag �� �ٸ� �뵵�� ���� / ����ó�� -->
<jsp:include page = "07SPActionIncludeParam.jsp">
	<jsp:param name ="str" value="<%=value %>"/>
</jsp:include>
::06JSPActionIncludeParam.jsp ��<br/>
</body>
</html>