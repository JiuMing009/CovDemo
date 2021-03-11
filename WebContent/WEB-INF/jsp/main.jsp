<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
	<section class="table-box">
        <table  class="table table-bordered">
            <caption>旅客信息表</caption>
			
            <thead>
				<tr class="sou">
					<td colspan="1" border-right="none" >
						<a class="btn btn-default  btn-xs" href="add" role="button">&nbsp;&nbsp;添&nbsp;&nbsp;加&nbsp;&nbsp;</a>
					</td>
					<td colspan="9">
						<div class="chaxun">
							<form action="selectMore" method="post" >
								姓名：<input name="pname" type="search" >&nbsp;&nbsp;&nbsp;&nbsp;
								航班：<input name="flt" type="search" > &nbsp;&nbsp;&nbsp;&nbsp;
								性别：<select name="sex" >
									<option>全部</option>
									<option>男</option>
									<option>女</option>
									</select>&nbsp;&nbsp;&nbsp;&nbsp;
								核酸检测结果：<select name="nucleci" >
									<option>全部</option>
									<option>阴性</option>
									<option>阳性</option>
									<option>无检测</option>
									</select>&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="submit" value="查询" class="btn btn-default  btn-xs" >&nbsp;&nbsp;&nbsp;&nbsp;
								<a class="btn btn-default  btn-xs" href="all" role="button" >显示全部</a>
							</form>
						</div>
					</td>
				</tr>
                <tr class="he">
					<td>序号</td>
					<td>旅客姓名</td>
					<td>年龄</td>
					<td>性别</td>
					<td>航班信息</td>
					<td>核酸检测结果</td>
					<td>入境时间</td>
					<td>体温</td>
					<td>是否接种疫苗</td>
					<td>操作</td>
					<!-- <td width="8px"></td> -->
				</tr>
            </thead>
 
            <tbody>
                <c:forEach var="p" items="${list}" varStatus="vs">
					<tr>
					<td>${vs.count}</td>
					<td>${p.pname}</td>
					<td>${p.age}</td>
					<td>${p.sex}</td>
					<td>${p.flt}</td>
					<td>${p.nucleci}</td>
					<td><fmt:formatDate value="${p.time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					<td>${p.temperature}</td>
					<td>${p.vaccine}</td>
					<td>
						<a class="btn btn-default btn-primary btn-xs" role="button" href="showPassenger?id=${p.id}">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="btn btn-default btn-danger btn-xs"  role="button"  onclick="deleteJobDetail(${p.id})">删除</a>
					</td>
					</tr>
				</c:forEach>

				<c:forEach var="p" items="${pa}" varStatus="vs">
					<tr>
					<td>${vs.count}</td>
					<td>${p.pname}</td>
					<td>${p.age}</td>
					<td>${p.sex}</td>
					<td>${p.flt}</td>
					<td>${p.nucleci}</td>
					<td><fmt:formatDate value="${p.time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					<td>${p.temperature}</td>
					<td>${p.vaccine}</td>
					<td>
						<a class="btn btn-default btn-primary btn-xs" role="button" href="showPassenger?id=${p.id}">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="btn btn-default btn-danger btn-xs"  onclick="deleteJobDetail(${p.id})">删除</a>
					</td>
					</tr>
				</c:forEach>
            </tbody>
        </table>
    </section>
</body>
<script type="text/javascript">
function deleteJobDetail(id){
	if(window.confirm("你要确定删除这条记录吗？"))
	{
		document.location="deletePassenger?id="+id;
	}
	
}
</script>

</html>

