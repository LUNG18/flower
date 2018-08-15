<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="/a/base.jsp" %>
<html>
	<head>
	<title>个人主页</title>
  	
  	<script>
		$(function(){
			if(confirm("是否启用动态监听方式展示个人主页？")){
				$("#collapse").load("/a/collapse.jsp")
			}else{
				$("#tab").load("/a/tab.jsp")
				//显示第一个选项卡内容
				$("#tabs li:eq(0) a").tab("show")
			}
			
			
			//订单条目改变css样式
			var ostate = $(".ostate").html()
			if("未付款"==ostate){
				$(".ostate").parent().addClass("warning")
			}else if("待付款"==ostate){
				$(".ostate").parent().addClass("danger")
			}else if("已付款"==ostate){
				$(".ostate").parent().addClass("success")
			}else{
				$(".ostate").parent().addClass("active")
			}
		})
	</script>
	</head>
	<body>
		<div id="collapse"></div>
		<div id="tab"></div>
	</body>
</html>