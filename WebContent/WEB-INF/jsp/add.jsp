<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>录入旅客信息</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/add.css">
</head>
<body>
<div class="ti">
	<h1>录入旅客信息</h1>
</div>
	<form action="addPassenger" method="post">
		旅&nbsp;&nbsp;客&nbsp;&nbsp;姓&nbsp;&nbsp;名：<input name="pname" type="text"><br>
		<p><p>
		年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：<input name="age" type="text"><br>
		<p><p>
		<!-- 性别：<input name="sex"><br> -->
		性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：<input type="radio" name="sex" checked="checked" value="男">男
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="女">女<br>
		<p><p>
		航&nbsp;&nbsp;班&nbsp;&nbsp;信&nbsp;&nbsp;息：<input name="flt" type="text"><br>
		<p><p>
		检&nbsp;&nbsp;测&nbsp;&nbsp;结&nbsp;&nbsp;果：<label><input type="radio" name="nucleci" checked="checked" value="阴性">阴性</label>
		<label><input type="radio" name="nucleci" value="阳性">阳性</label>
		<label><input type="radio" name="nucleci" value="无检测">无检测</label><br>
		
		<p><p>
		入&nbsp;&nbsp;境&nbsp;&nbsp;时&nbsp;&nbsp;间：<input name="time" type="text"><br>
		<p><p>
		体&nbsp;温&nbsp;测&nbsp;量值：<input name="temperature" type="text"><br>
		<p><p>
		是否接种疫苗：<label><input type="radio" name="vaccine" checked="checked"s value="是">是</label>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<label><input type="radio" name="vaccine" value="否">否</label><br>
		<p><p>
		<input class="btn1" type="submit" value="确&nbsp;&nbsp;定">
		<a class="btn2 " href="all" >取&nbsp;&nbsp;消</a>
	</form>
	
	

</body>
</html>