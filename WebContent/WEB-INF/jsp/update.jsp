<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/update.css">
</head>
<body>
<div class="ti">
	<h1>修改旅客信息</h1>
</div>
	<form action="updatePassenger?id=${pa.id}" method="post">
		旅&nbsp;&nbsp;客&nbsp;&nbsp;姓&nbsp;&nbsp;名：<input name="pname" type="text" value="${pa.pname}"><br>
		<p></p>
		年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：<input name="age" type="text" value="${pa.age}"><br>
		<p></p>
		<!-- 性别：<input name="sex"><br> -->
		性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：
		<c:if test="${pa.sex=='男'}">
		<input type="radio" name="sex" checked="checked" value="男"/>男
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="sex"  value="女"/>女
		</c:if>
		
		<c:if test="${pa.sex=='女'}">
		<input type="radio" name="sex"  value="男"/>男
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="sex" checked="checked" value="女"/>女
		</c:if>
		<p></p>
		航&nbsp;&nbsp;班&nbsp;&nbsp;信&nbsp;&nbsp;息：<input name="flt" type="text" value="${pa.flt}"><br>
		<p></p>
		检&nbsp;&nbsp;测&nbsp;&nbsp;结&nbsp;&nbsp;果：
		<c:if test="${pa.nucleci=='阴性'}">
			<input type="radio" name="nucleci" checked="checked" value="阴性" />阴性
			<input type="radio" name="nucleci" value="阳性" />阳性
			<input type="radio" name="nucleci" value="无检测" />无检测
		</c:if>
		
		<c:if test="${pa.nucleci=='阳性'}">
			<input type="radio" name="nucleci"  value="阴性" />阴性
			<input type="radio" name="nucleci" checked="checked" value="阳性" />阳性
			<input type="radio" name="nucleci" value="无检测" />无检测
		</c:if>
		<c:if test="${pa.nucleci=='无检测'}">
			<input type="radio" name="nucleci"  value="阴性" />阴性
			<input type="radio" name="nucleci" value="阳性" />阳性
			<input type="radio" name="nucleci"  checked="checked" value="无检测" />无检测
		</c:if>
		<p></p>
		入&nbsp;&nbsp;境&nbsp;&nbsp;时&nbsp;&nbsp;间：<input name="time" type="text" value='<fmt:formatDate value="${pa.time}"
		 pattern="yyyy-MM-dd HH:mm:ss"/>'><br>
		<p></p>
		体&nbsp;温&nbsp;测&nbsp;量值：<input name="temperature" type="text" value="${pa.temperature}"><br>
		<p></p>
		是否接种疫苗：
		<c:if test="${pa.vaccine=='是'}">
			<label><input type="radio" name="vaccine" checked="checked"  value="是" />是</label>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<label><input type="radio" name="vaccine" value="否" />否</label><br>
		</c:if>
		
		<c:if test="${pa.vaccine=='否'}">
			<label><input type="radio" name="vaccine" value="是" />是</label>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<label><input type="radio" name="vaccine" checked="checked" value="否" />否</label><br>
		</c:if>
		<p></p>
		<input class="btn1" type="submit" value="确&nbsp;&nbsp;定">
		<a class="btn2 " href="all" >取&nbsp;&nbsp;消</a>
	</form>
</body>
</html>