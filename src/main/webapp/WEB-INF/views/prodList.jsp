<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="/a/header.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>商品列表页</title>
		<script src="js/jquery-2.2.1.js"></script>
		<script>
			$(function () {
				$("#info").click(function () {
					location.href = "info";
                })
            })
		</script>
	</head>
	<body>
		<a href="#" id="info">导出明细</a>
	<br/>
	
     <div class="left-side" style="text-align:center;">
           <!-- 表单部分 -->
           <form class="form-inline" id="taskList_form">
               <div class="form-group">
               	价格区间 ： <input style="width:50px"/> — <input style="width: 50px" />
               </div>
               <div class="form-group">
					<input name="content"/>
               </div>
               <div class="form-group"> 
					<button id="search"> 搜索 </button>
               </div>
           </form>
     </div>
  <hr/>
  <div class="tab-content">
	  <table class="table table-striped">
	  	<tbody>
		  	<c:forEach items="${pList}" var="prod">
		  		<tr>
			  		<td>${prod.pname }</td>
			  		<td>${prod.pinfo }</td>
			  		<td>${prod.pcost }</td>
			  		<td>${prod.ptime }</td>
			  	</tr>
		  	</c:forEach>
	  	</tbody>
	  </table>
  </div>
  
  
  
  	<br/><br/><br/><br/><br/><br/>
	</body>
<%@include file="/a/footer.jsp" %>
</html>