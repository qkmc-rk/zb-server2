<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>message board</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap-theme.min.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/messagebox.css"/>
	<script src="${pageContext.request.contextPath }/js/jquery-2.1.0.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath }/js/messagebox.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		function deleteMsg(obj){
			$.ajax({
		          type : "post",
		          url : "deleteMsg.do",
		          data : "rqstuserid=" + $(obj).attr("id"),
		          async : false,
		          success : function(data){
		            if(data == "true"){
		            	alert("delete success");
		            	$(obj).parents("tr").remove();
		            }
		          }
		     });
		}
	</script>
</head>
<body>
	<div class="nav">
		<ul class="nav nav-tabs">
		  <li role="presentation" class="active"><a href="#">message</a></li>
		  <li role="presentation"><a href="#">Profile</a></li>
		  <li role="presentation"><a href="#">Messages</a></li>
		  <li><a href="#"><img src="img/QQ20170403155626.png"/></a></li>
		</ul>
	</div>
	<div class="jumbotron">
	  <h1>welcome,my friend,<a href="#">${ sessionScope.user.user_name }</a></h1>
	  <div style="display: none" id="usersname">${ sessionScope.user.user_name }</div>
	  <p>this is my message board,love it? just say what you want,and what you like?!</p>
	  <p><a class="btn btn-primary btn-lg" href="#" role="button">about mr.ruan</a></p>
	</div>
	
	<!--show messages-->
	<div class="messageshow">
		<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><img src="${pageContext.request.contextPath }/images/monitoring.ico"></div>
		  <div class="panel-body">
		    <p>this area is for displating message!see the bottom~</p>
		  </div>
		
		  <!-- Table -->
		  <table class="table" id="show_tab">
		    <tr  id="show_tab_one">
		    	<th>floor</th>
		    	<th>person</th>
		    	<th>meassage</th>
		    	<th>operation</th>
		    </tr>
		    <!-- I added -->
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
		    <!-- I added top-->
		  </table>
		</div>
		
		<!--pega navigator  -->
		<nav aria-label="Page navigation">
		  <ul class="pagination">
		    <li>
		      <a  aria-label="Previous" id="lastpage">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		      <a>
		      	<div id="currentPages">
		      	</div>
		      </a>
		      <a  aria-label="Next"  id="nextpage">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		</nav>
		<!-- user input-->
		<div class="input-group">
	      <input type="text" class="form-control" placeholder="write message here..." id="userMsg">
	      <span class="input-group-btn">
	        <button id="msg" class="btn btn-default" type="button" onclick="submitMsg()">comment!</button>
	      </span>
	    </div><!-- /input-group -->
	    <!-- test for rk -->
	    <a href="testModel.do">test translate Model</a>
	    <!-- test for rk end-->
	</div>
	<a></a>
</body>
</html>