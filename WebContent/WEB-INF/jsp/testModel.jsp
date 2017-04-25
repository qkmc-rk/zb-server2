<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${msglist}" var="msg">
			     <tr id="show_tab_tr">
			     	<td>${msg.msg_id }</td>
			    	<td>${msg.userName }</td>
			    	<td>${msg.msg }</td>
			    	<c:if test="${sessionScope.user.user_name == msg.userName }">
			    	<td><a id= "${msg.msg_id }" onclick="deleteMsg(this)">delete</a></td>
			    	</c:if>
			     </tr>
		    </c:forEach>
</body>
</html>