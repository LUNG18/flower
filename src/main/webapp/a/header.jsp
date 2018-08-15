<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/a/base.jsp" %>    
    <html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/css/header.css"></link>
		<title>头部组件</title>
	</head>
	<body>
		<img src="img/title_bgs.jpg">
		<div id="#1" class="container">
			<div class="row">
				<div id="#1_1" class="col-xs-3  text-center">
					欢迎：${user.uname } 
					<input type="hidden" name="uid" value="${user.uid }" />
				</div>
				<div id="#1_2" class="col-xs-6">
					<a href="toPersonHP?uid=${user.uid }">个人中心</a>
				</div>
				<div id="#1_3" class="col-xs-3 text-center">
					<a href="loginOut">注销</a>
				</div>
			</div>
		</div>
	</body>
</html>