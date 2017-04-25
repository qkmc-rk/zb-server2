<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0" />
<title>Mr.Ruan's message board</title>

	<!--what we need-->
	<script src="${pageContext.request.contextPath }/js/jquery-2.1.0.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath }/css/bootstrap-theme.css" type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap-theme.min.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css"/>
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath }/js/npm.js" type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/main.css"/>
	
	<script type="text/javascript">
		function checkpwd(){
			var state = 0;
			
			/* var url = "checkpwd.do"; */
			/* var args = {"password":document.getElementById("password").value}; */
			/* $.POST(url,args,function(data){
				if(data == "false")  return false;
				else if(data == "true")  return true;
			}); */
			
			$.ajax({
		          type : "post",
		          url : "checkpwd.do",
		          data : "password=" + document.getElementById("password").value,
		          async : false,
		          success : function(data){
		            if(data == "true") state=1;
		          }
		     });
			if(state == 1){
				document.getElementById("tipss").innerHTML = "";
				return true;
			} 
			else{
				document.getElementById("tipss").style.color = "red";
				document.getElementById("tipss").innerHTML = "check user's name and password";
				return false;
			} 
		}
		function checkname(){
			var state = 0;
			/* var url = "checkname.do";
			var args={"username":document.getElementById("username").value};
			
			$.POST(url,args,function(data){
				if(data == "false")  return false;
				else if(data == "true")  return true;
			}); */
			
			$.ajax({
		          type : "get",
		          url : "checkname.do",
		          data : "username=" + document.getElementById("username").value,
		          async : false,
		          success : function(data){
		            if(data == "true") state=1;
		          }
		     });
			if(state == 1){
				document.getElementById("tipss").innerHTML = "";
				return true;
			} 
			else{
				document.getElementById("tipss").style.color = "red";
				document.getElementById("tipss").innerHTML = "check user's name and password";
				return false;
			} 
		}
		
		function checkusers(){
			return (checkpwd() && checkname());
		}
    </script>
	</head>
	<body>
		<div class="box">
			<h1 id="tag-ruan">Welcome to Mr.Ruan's World</h1>
				<div class="login-box">
					<div class="login-title text-center">
						<h1><small>Login</small></h1>
					</div>
					<div class="login-content ">
					<div class="form">
					<form action="login.do" method="post">
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
									<input type="text" id="username" name="username" class="form-control" placeholder="username">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
									<input type="password" id="password" name="password" class="form-control" placeholder="password">
								</div>
							</div>
						</div>
						<div class="form-group form-actions">
							<div class="col-xs-4 col-xs-offset-4 ">
								<button type="submit" class="btn btn-sm btn-info" onclick="return checkusers()"><span class="glyphicon glyphicon-off"></span> login</button>
							</div>
							<div id="mytip"></div>
						</div>
						<div class="form-group">
							<div class="col-xs-6 link">
								<p class="text-center remove-margin"><small>forget passworld?</small> <a href="javascript:void(0)" ><small>find password</small></a>
								</p>
							</div>
							<div class="col-xs-6 link">
								<p class="text-center remove-margin"><small>not regist?</small> <a href="javascript:void(0)" ><small>register</small></a>
								</p>
							</div>
						</div>
						
					</form>
				  </div>
				  <div id="tipss" style="width:100%; text-align:center;"></div>
				</div>
			</div>
		</div>
		<div class="modal-footer" style="text-align: center;">
			<h6> (c) Copyright 2017 Mrruan. All Rights Reserved. </h6>
		</div>
	</body>

</html>