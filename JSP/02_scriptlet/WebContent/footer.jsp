<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String title = "1부터 100까지의 합 구하기";
	
	public int whileSum(){ //void썼을때 오류뜨지만 자동완성따윈없다 우리가 고쳐야함
		int total = 0;
		for(int i = 0 ; i <= 100 ; i++){
			total += i;
		}
		return total;
	}
%>
<div class = "footer">
	<p> title : <%=title%></p>
	<p> 답은 <%=whileSum()%> 입니다.</p> <!-- 옆에 오류 그냥 버그뜬거 -->
	
<%--
	영역 자체를 주석	
--%>
</div>