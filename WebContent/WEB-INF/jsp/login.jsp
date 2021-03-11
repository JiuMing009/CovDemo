<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
<section>
		<div class="color"></div>
		<div class="color"></div>
		<div class="color"></div>
		<div class="box">
			<div class="circlre" style="--x:1"></div>
			<div class="circlre" style="--x:2"></div>
			<div class="circlre" style="--x:3"></div>
			<div class="circlre" style="--x:4"></div>
			<div class="circlre" style="--x:5"></div>
			<div class="container">
			    <div class="form">
					<h2>登录</h2>
					<form action="${pageContext.request.contextPath}/User/loginCheck" method="post">
						<div class="inputBox">
							<input type="text" placeholder="用户名" name="name" >
 						</div>
						<div class="inputBox">
							<input type="password" placeholder="密码" name="password" >
 						</div>
						<div class="inputBox">
							<input type="submit" value="登录">
 						</div>
						
						<a class="zhu btn" href="register">注册</a>
						
						<p class="forget">忘记密码？
							<a href="#"></a>
						</p>
					
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>