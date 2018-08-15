<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/a/base.jsp" %>
<!DOCTYPE html>  
<html>
<head>
	<title>注册页面</title>
</head>
<body>
	<div class="container">
		<div class="form row">
			<h3 class="form-title" align="center">注册</h3>
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="userAddForm" action="regest" method="post">
			  <div class="col-sm-7 col-md-7">
			  	<div class="form-group">
			    <label for="uname">姓名:</label>
			    <input type="text" class="form-control" name="uname" placeholder="请输入姓名"/>
			  </div>
			  <div class="form-group">
			    <label for="upwd">密码:</label>
			    <input type="text" class="form-control" name="upwd" placeholder="请输入密码"/>
			  </div>
			  <div class="form-group">
			    <label for="upwd2">确认密码:</label>
			    <input type="text" class="form-control" name="upwd2" placeholder="请输入确认密码"/>
			  </div>
			  <div class="form-group">
			  	<label for="usex">性别:</label><br>
		  		<input type="radio" name="usex" value="man"/>男 &nbsp;&nbsp;&nbsp;&nbsp;
		  		<input type="radio" name="usex" value="woman"/>女
			  </div>
			  <div class="form-group">
			    <label for="ubirthday">生日:</label>
			    <div class="input-group date" id="datetimepicker">
			    	<span class="input-group-addon">  
	                    <span class="glyphicon glyphicon-calendar"></span>  
	                </span>
			    	<input type="text" class="form-control" name="ubirthday" placeholder="请输入生日"/>
			    </div>
			  </div>
			  <!-- 使用隐藏域设置会员初始等级  -->
			  <input type="hidden" value="1" name="ugrade"/>
			  <div class="form-group">
				  <button type="reset" class="btn">重写</button>
				  <button type="submit" class="btn">注册</button>
			  </div>
			  </div>
			</form>
		</div>
	</div>
	
	
</body>
</html>