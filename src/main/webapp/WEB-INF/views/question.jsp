<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>生成question页面</title>
		<script src="http://code.jquery.com/jquery-3.2.1.js"></script>
		<script type="text/javascript">
			$(function(){
				var getData = function(){
					var questionId = $("#questionId").val()
					return {'questionId':questionId}
				};
				$(":checkbox").click(function(){
					if($(this).is(':checked') && $(this).val()=='苹果'){
						$.ajax({
							url:'getSonQuestion',
							type:'get',
							data:getData(),
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
						$("#sonQuestion").html("");
					}
				});
			});
		</script> 
	</head>
	<body>
		
		<form action="/saveQuestion" method="post">
			<h3>${question.text}</h3>
			
			<input type="hidden" value="${question.text}" name="text" id="questionText">
			<input type="hidden" value="${question.id}" name="id" id="questionId">
			
			<c:forEach items="${question.options}" var="opt" varStatus="loop">
				<input type="checkbox" name="options[${loop.index}].text" value="${opt.text}">${opt.text}
				<input type="hidden" name="options[${loop.index}].value" value="${opt.value}">
				<br><br>
			</c:forEach>
			<div id="sonQuestion"></div>
			<button type="submit">保 存</button>
		</form>
	</body>
</html>