<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
<script>
	var name = '<%=request.getParameter("userName")%>';
	var gender = '<%=request.getParameter("gender")%>';
	var arr =[];
	<%
		String[] hobby = request.getParameterValues("hobby");
	
		for(int i = 0 ; i<hobby.length ; i++){
	%>
			arr.push('<%=hobby[i]%>'); //이런방식 선호하진 않음
	<%
		}
	%>
	console.log(name);
	console.log(gender);
	console.log(arr);
</script>
</html>