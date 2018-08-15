$(function(){
	//时间插件时间
	$("#datetimepicker").datetimepicker({
		language:'zh-CN',
		autoclose:true,
		minView:"month",
		todyBtn:true,
		initialDate: "1984-1-1",
		linkField:"mirror_field",
		linkFormat: "yyyy-mm-dd"
	})

	//清除提示信息
	$("input[name='username']").click(function(){
		$("#message").html("")
	})
	$("input[name='password']").click(function(){
		$("#message").html("")
	})

	
})