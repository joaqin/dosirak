<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");

	//id 가 admin 이면 join_result.png를 
	//다른 아이디 이면  secession.png를 보여준다.
	String img="secession.png";
	if( "admin".equals(id)){
		img="join_result.png";
	}//end if
%>
../common/images/<%=img %>
