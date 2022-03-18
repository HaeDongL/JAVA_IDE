<%@ page contentType="text/html;charset=euc-kr"%>
<br/><hr/>
	<h3>
		o 07JSPActionIncludeParam.jsp 시작<br/><br/>
		
		request,session,application Ojbect Scope Data 추출 <br/><br/>
		
		request ObjectScope 추출 Data : <%= request.getAttribute("aaa") %><br/>
		session ObjectScope 추출 Data : <%= session.getAttribute("bbb") %><br/>
		application ObjectScop 추출 Data : <%= application.getAttribute("ccc") %><br/><br/>
		
		o 07JSPActionIncludeParam.jsp끝</br>
	
	</h3>


<hr/><br/>