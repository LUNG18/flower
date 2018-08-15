<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>
<%@include file="/a/header.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script src="http://code.jquery.com/jquery-3.2.1.js"></script>
		<script src="https://cdn.bootcss.com/html2canvas/0.4.1/html2canvas.js"></script>
		<title>首页</title>
		<script type="text/javascript">
			$(function(){
				$("#button").click(function(){
					$.ajax({
						type:"get",
						url:"http://192.168.16.72:8002/save",
						dataType:'jsonp',
						jsonp:'callback',
						data:{'id':1, 'name':'lung'},
						success:function(data){
							alert(data);
							$.each(data, function(index, item){
								alert(index + "   " + item);
							});
						}
					});
				});
				
				$(":checkbox").click(function(){
					var index = $(":checkbox").index($(this));
					if($(this).is(":checked")){
						var text = $(this).next().text();
						$(this).append(
							"<input type='hidden' name='options[" + index + "].text' value='" + text + "'>"		
						);
						$.ajax({
							url:'getSonQuestion',
							type:'get',
							data:{'questionId':28},
							success:function(question){
								var qu = "<h3>"+question.text+"</h3>"
												+"<input type='hidden' value='"+question.text+"' name='text' id='questionText'>"
												+"<input type='hidden' value='"+question.id+"' name='id' id='questionId'>";
								
								var opts = question.options;
								$("#sonQuestion").append(qu);
								for(var i=0;i<opts.length;i++){
									$("#sonQuestion").append(
										"<input type='checkbox' name='options["+i+"].text' value='"+opts[i].text+"'>"+opts[i].text
										+"<input type='hidden' name='options["+i+"].value' value='"+opts[i].value+"'>"	
									);
								}
							}
						});
					}else{
						$(this).html("");
						$("#sonQuestion").html("");
					}
				});
				
				$("#autoForm").click(function(){
					$.get("/form",function(data, status){
						alert(data + "\n" + status);
					});
				});
				
				$("#img").click(function(){
					/* $(this).hide(); */
					window.scroll(0,0);
                    html2canvas(document.body,{
						 	onrendered: function(canvas) {
                         	var myImage = canvas.toDataURL("image/jpeg"); 
                            $.ajax({
	                            url:'image.jsp',
	                            type:'post',
	                            data:{"image" : myImage},
	                            success:function(result){
	                                alert(result);
	                            },
	                            error:function(message){
	                                alert(message)
	                            }
	                        })
                         }
                    })
				})
				

			});
		</script>
	</head>
	<body>	
		<button id="img">截  屏</button>
		<button id="button">跨  域</button>	
		<br/>
		这是还没设计的首页
	  	<form action="saveQuestion" method="post">
	  		<c:set var="num" value="1"></c:set>
			<div id="parentQuestion">
				第${num}题:<div id="questionText">你的爱好是什么？</div>
				<input type="hidden" name="text" value="你的爱好是什么?">
				<input type="checkbox" name="options[0].value" value="1" class="option">
					<span class="optionText">篮球</span><br>
				<input type="checkbox" name="options[1].value" value="2" class="option">
					<span class="optionText">足球</span><br>
				<input type="checkbox" name="options[2].value" value="3" class="option">
					<span class="optionText">排球</span><br>
				<input type="checkbox" name="options[3].value" value="4" class="option">
					<span class="optionText">游泳</span><br>
					
				第${num+1}题:<div id="questionText">张老七，我问你，你滴家乡在哪里？</div>
				<input type="hidden" name="text" value="张老七，我问你，你滴家乡在哪里？">
				答：<input name="options[4].text" />
			</div>
			<div id="sonQuestion"></div>
			
			<button type="submit">提  交</button>
		</form>
	  	<br/><br/><br/>
	  	<button id="autoForm">测试：自动生成表单</button>
	</body>
<%@include file="/a/footer.jsp" %>
</html>