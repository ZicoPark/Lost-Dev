<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "header.jsp" %>
	<ul>
	<% // java 로직 영역을 지정해 준다. 영역지정하는게 매우중요.요즘은 잘안하지만 빡세니까 해보는것.
	for(int i = 0 ; i<10 ; i++){
	%>
		<!--  java의 값을 html에 출력 하고 싶은 경우 -->
		<li><%=i%></li>
	<%
	}
	%>
	</ul>
	<%@include file = "footer.jsp" %>
</body>
</html>