<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>클라이언트에서 보낸 내용</h1>
	<p>
		이름 :
		<%= request.getParameter("userName") %>
	</p>
	<p>
		성별 : <%= request.getParameter("gender") %>
	</p>
	<p>
		취미 : 
		<%
			String[] hobby = request.getParameterValues("hobby"); //오늘의 핵심. 배열.
			for(int i = 0 ; i<hobby.length ; i++){
		%>
				<%= hobby[i]%>
		<%
		}
		%>
	</p>
	<hr/>
	<h1>그 밖의 내용</h1>
	<p>전송 방식 : <%=request.getMethod() %></p>
	<p>IP 주소(IpV6) : <%=request.getRemoteAddr() %></p>
	<p>요청쿼리 : <%=request.getQueryString() %></p> <!-- userName= 한글깨져서나오는것~ -->
	<p>요청 URL : <%=request.getRequestURL() %></p> <!-- http://localhost/03_request/result.jsp -->
	<p>요청 URI : <%=request.getRequestURI() %></p> <!--/03_request/result.jsp-->
</body>
</html>