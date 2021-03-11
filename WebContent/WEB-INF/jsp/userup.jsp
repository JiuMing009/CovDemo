<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
管理员
<form action="" method="post">
						<div class="inputBox">
							用户名：<input type="text" name="name" value="${user.name}" >
 						</div>
						<div class="inputBox">
							密码：<input  name="password"  value="${user.password }">
 						</div>
 					</form>
</body>
</html>