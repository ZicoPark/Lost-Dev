<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	// 변수나 메서드 선언문
	Calendar c = Calendar.getInstance();
	int hour = c.get(Calendar.HOUR_OF_DAY);
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	
%>
<div class = "header">
	현재 시간은 <%=hour%>시 <%=min%>분 <%=sec%>초
	
	<!--  오전/오후 를 제외한 모두를 <%%> 씌워버림 -->
	<%
	if(hour<12){
	%>
		오전
	<%} else {%>
		오후
	<%
	}
	%>입니다.

</div>