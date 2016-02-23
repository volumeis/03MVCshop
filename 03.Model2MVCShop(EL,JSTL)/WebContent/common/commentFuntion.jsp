<%@page import="java.util.Date"%>
<%@page import="com.model2.mvc.common.Reply2"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List list = new ArrayList();
	//public Reply(int replyNo, User user, Product product, int ref, Date date, String comment) {
	
	Reply2 reply01 = new Reply2(1,"admin",10001,0,new Date(2016,02,22,01,01,00),"admin");	
	Reply2 reply02 = new Reply2(2,"user1",10001,1,new Date(2016,02,22,05,01,00),"user01");	
	Reply2 reply03 = new Reply2(3,"admin",10001,2,new Date(2016,02,22,07,01,00),"admin");	
	Reply2 reply04 = new Reply2(4,"user2",10001,1,new Date(2016,02,22,06,01,00),"user02");	
	Reply2 reply05 = new Reply2(5,"user3",10001,0,new Date(2016,02,22,03,01,00),"user03");	

	list.add(reply01);
	list.add(reply02);
	list.add(reply03);
	list.add(reply04);
	list.add(reply05);
	pageContext.setAttribute("totalCount",5);
	pageContext.setAttribute("list", list);
	
	System.out.println(list.get(1));
%>


<c:set var ="i" value ="${0}"/>
<c:set var = "depth" value = "${0}"/>
<%-- <c:forEach var="reply" items="${replyMap.list}"> --%>
<c:forEach var="reply" items="${list}">
	<c:set var = "i" value = "${i+ 1 }"/>
	<div>
		${i} is
		<c:if test="${reply.ref != 0 }">
		[]
		</c:if>
		${reply} </br>
	</div>
	
</c:forEach>







<div>
	<input type="text" name="searchKeyword"  value="${search.searchKeyword}" style="width:200px; height:19px" />
	<a href="/images/ct_btnbg02.gif">댓글입력</a>
</div>