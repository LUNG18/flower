<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
   	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
 	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
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
			
			//定义图标显示与隐藏
			$("#overflow").scroll(function() {
				var s =$("#overflow").scrollTop()
				if(s > 500) {
					$("#returnTop").css("display", "block");
				} else {
					$("#returnTop").css("display", "none");
				}
			})
			//定义到达顶部事件
			$("#returnTop").click(function() {
				$("#overflow").animate({scrollTop: 0}, 1000);
			})
		})
	</script>
	<body>
	<nav id="navbar-example" class="navbar navbar-default navbar-static" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button class="navbar-toggle"   type="button"
					data-toggle="collapse" data-target=".bs-js-navbar-scrollspy">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse bs-js-navbar-scrollspy">
				<ul class="nav navbar-nav">
					<li>
						<a href="#s1">个人资料</a>
					</li>
					<li>
						<a href="#s2">订单</a>
					</li>
					<li>
						<a href="#s3">收货地址</a>
					</li>
					<li>
						<a href="#s4">我的收藏</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div id="overflow" data-spy="scroll" data-target="#navbar-example" data-offset="0"  style="width:100%;height: 100%;overflow: auto;position: fixed;">
		<h4 id="s1">个人资料</h4>
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
		<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
		
		
		<h4 id="s2">订单</h4>
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
			  <tr>
			      <td>${order.onum }</td>
			      <td>${order.otime }</td>
			      <td>${user.addr.aaddr }</td>
			      <td>${user.addr.atime }</td>
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
		<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
		
		
		<h4 id="s3">收货地址</h4>
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
		
		
		<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
		<h4 id="s4">我的收藏</h4>
		<p>我的收藏</p>
		<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	</div>
	<div id="returnTop" style="position:absolute;right:5%;bottom:5%;display: none;">
		<a href="#" title="点击返回最上层"><img src="../img/returnTop.jpg"/></a>
	</div>
	</body>
</html>