<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/a/base.jsp" %>
<!DOCTYPE html>  
<html>  
    <head>  
        <title>登陆页面</title>
        <link rel="stylesheet" href="css/login.css"></link>  
    </head>  
    <body>  
    
    <div class="container">  
        <div class="form row">  
        	<h3 class="form-title" align="center">登陆</h3>
        	<div id="message">${error }</div>
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" action="login" method="post">  
                <div class="col-sm-9 col-md-9">  
                    <div class="form-group">  
                        <i class="fa fa-user fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="用户名" name="username" autofocus="autofocus" maxlength="20"/>  
                    </div>  
                    <div class="form-group">  
                        <i class="fa fa-lock fa-lg"></i>  
                        <input class="form-control required" type="password" placeholder="密码" name="password" maxlength="8"/>  
                    </div>  
                    <div class="form-group">  
                        <label class="checkbox">  
                            <input type="checkbox" name="remember" value="1"/> 记住我  
                        </label>  
                    	<hr/>  
                        <a href="toRegest" id="register_btn" btn btn-success><small style="color: #CDCDCD">没有账户？点击注册</small></a>
                    </div>  
                    <div class="form-group">  
                        <input type="submit"  class="btn btn-success pull-right" value="登陆 "/>     
                    </div>  
                </div>  
            </form>  
        </div>  
    </div>  
    </body>  
</html>