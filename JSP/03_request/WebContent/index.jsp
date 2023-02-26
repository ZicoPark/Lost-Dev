<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td{
		border : 1px solid black;
		border-collapse: collapse;
	}
	th,td{
		padding : 5px 10px;
	}
	
</style>
</head>
<body>
	<h1>회원 정보</h1>
	<form action = "result.jsp"  method="get">
	<table>
		<tr>
			<th>이름</th>
			<td><input type = "text" name="userName"/></td>
		</tr>
		<tr>
			<th>성별</th>
			<td>
				<input type = "radio" name="gender" value="남자"/>남자
				<input type = "radio" name="gender" value="여자"/>여자
			</td>
		</tr>
		<tr>
			<th>취미</th>
			<td>
				<input type = "checkbox" name="hobby" value="독서"/> 독서
				<input type = "checkbox" name="hobby" value="게임"/> 게임
				<input type = "checkbox" name="hobby" value="운동"/> 운동
				<input type = "checkbox" name="hobby" value="영화"/> 영화
			</td>
		</tr>
		<tr>
			<th colspan="2">
				<input type = "submit" value="전송" />
			</th>
		</tr>
	</table>
	</form>
</body>
</html>