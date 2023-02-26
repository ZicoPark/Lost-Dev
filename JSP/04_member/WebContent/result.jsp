<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- index.html로 부터 온 파라메터 값을 여기에 표현 하시오. -->
	<p>아이디 : <%= request.getParameter("userId") %></p>
	<p>비밀번호 : <%= request.getParameter("userPw") %></p>
	<p>비밀번호 확인 : <%= request.getParameter("userPwconfirm") %></p>
	<p>이름 : <%= request.getParameter("userName") %></p>
	<p>이메일 : <%= request.getParameter("email") %></p>
	<p>
		생년월일 :
		<%= request.getParameter("year") %>년
		<%= request.getParameter("month")%>월
		<%= request.getParameter("day") %>일
	</p>
	<p>성별 : <%= request.getParameter("gender") %></p>
	<p>취미 : 
		<%
			String[] hobby = request.getParameterValues("hobby");
			for(String h : hobby){
		%>
				<%=h%>,
		<%
		}
		%>
	</p>
	<p>나이 : <%= request.getParameter("age") %></p>
	<p>보안등급 : <%= request.getParameter("security") %></p>

</body>
</html>