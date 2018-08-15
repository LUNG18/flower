<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
   	<script   src="https://code.jquery.com/jquery-3.2.1.js"></script>
  	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(function(){
			//订单条目改变css样式
			$(".ostate").each(function(){
				var ostate = $(this).html()
				if("未付款"==ostate){
					$(this).parent().addClass("warning")
				}else if("待付款"==ostate){
					$(this).parent().addClass("danger")
				}else if("已付款"==ostate){
					$(this).parent().addClass("success")
				}else{
					$(this).parent().addClass("active")
				}
				
			})
			
		})
	</script>
	<body>
		<ul id="tabs" class="nav nav-tabs">
				<li class="active">
					<a href="#1" data-toggle="tab">个人资料</a>
				</li>
				<li>
					<a href="#2" data-toggle="tab">订单</a>
				</li>
				<li>
					<a href="#3" data-toggle="tab">收货地址</a>
				</li>
				<li>
					<a href="#4" data-toggle="tab">我的收藏</a>
				</li>
			</ul>
			<div id="myTabContent" class="tab-content">
				<div id="1" class="tab-pane fade in active">
					<table class="table table-striped">
					  <tbody>
					    <tr>
					      <th>用户名</th>
					      <td>${user.uname}</td>
					    </tr> 
					    <tr>
					      <th>性别</th>
					      <td>${user.usex }</td>
					    </tr> 
					    <tr>
					      <th>生日</th>
					      <td>${user.ubirthday }</td>
					    </tr> 
					    <tr>
					      <th>等级</th>
					      <c:if test="${user.ugrade == 1}">
						      <td>钻石</td>
					      </c:if>
					      <c:if test="${user.ugrade == 2}">
						      <td>黄金</td>
					      </c:if>
					      <c:if test="${user.ugrade == 3}">
						      <td>白银</td>
					      </c:if>
					      <c:if test="${user.ugrade == 4}">
						      <td>青铜</td>
					      </c:if>
					      <c:if test="${user.ugrade == 5}">
						      <td>普通</td>
					      </c:if>
					    </tr> 
					    <tr>
					      <th>总消费</th>
					      <td>${user.uconsume }</td>
					    </tr>
					  </tbody>
					</table>
				</div>
				<div id="2" class="tab-pane fade">
					<table class="table">
					  <thead>
					    <tr>
					      <th>订单号</th>
					      <th>订单时间</th>
					      <th>收货地址</th>
					      <th>发货时间</th>
					      <th>金额</th>
					      <th>付款状态</th>
					     </tr>
					  </thead>
						  <tbody>
						  <c:forEach items="${user.orderList}" var="order">
						    <tr class="active">
						      <td>${order.onum }</td>
						      <td>${order.otime }</td>
						      <td>${user.addr.aaddr }</td>
						      <td>${order.otime }</td>
						      <td>${order.ototal }</td>
						      <c:if test="${order.ostate == 1}">
							      <td class="ostate">未付款</td>
						      </c:if>
						      <c:if test="${order.ostate == 2}">
							      <td class="ostate">待付款</td>
						      </c:if>
						      <c:if test="${order.ostate == 3}">
							      <td class="ostate">已付款</td>
						      </c:if>
						      <c:if test="${order.ostate == 4}">
							      <td class="ostate">退款</td>
						      </c:if>
						     </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
				<div id="3" class="tab-pane fade">
					<table class="table">
					  <thead>
					    <tr>
					      <th>收货地址</th>
					      <th>收货人</th>
					      <th>邮编</th>
					      <th>收货人电话</th>
					      <th>邮箱</th>
					      <th>发货时间</th>
					     </tr>
					  </thead>
					  <tbody>
					    <tr class="active">
					      <td>${user.addr.aaddr }</td>
					      <td>${user.addr.aname }</td>
					      <td>${user.addr.azipcode }</td>
					      <td>${user.addr.atel }</td>
					      <td>${user.addr.aemail }</td>
					      <td>${user.addr.atime }</td>
					     </tr>
					  </tbody>
					</table>
				</div>
				
				
				<div id="4" class="tab-pane fade">我的收藏</div>
			</div>
		
	</body>
</html>