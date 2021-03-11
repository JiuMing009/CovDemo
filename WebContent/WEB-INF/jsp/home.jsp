<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">
<style type="text/css">
.yonghu .image{
			position:absolute;
			left:60px;
			top:5px;
			margin:0;
			padding:0;
			width:80px;
			height:80px;
			border-radius:80px;
			background:#fff;
			background-image: url("${pageContext.request.contextPath}/img/2.jpg");
			background-repeat: no-repeat;
		}
</style>
</head>
<body>
	

<div class="mainbox">  
            <div class="header">
          		<h1>新冠型肺炎分析系统</h1>
				<a class="btn" href="${pageContext.request.contextPath}/User/logout">注销</a>
				
            </div>
            <div class="left">
				<div class="log">
					<h1>COVID-19&nbsp;&nbsp;MIS</h1>
				</div>
               	<div class="yonghu">
               		<div class="image">
               		</div>
               		<label>您好！<a class="nm"><%=session.getAttribute("name") %></a>
            
               		</label>
               	</div>
               	<div class="cai">
		             <ul id="nav">
						<li><a href="${pageContext.request.contextPath}/Passenger/all" target="mainframe">首&nbsp;&nbsp;&nbsp;&nbsp;页</a></li>
						<li>
							<a href="javascript:void(0);" onclick="doMenu(this)">账&nbsp;&nbsp;&nbsp;&nbsp;户</a>
							 <ul>
							 	 <li><a href="userup?name=<%=session.getAttribute("name") %>" target="mainframe">个人资料</a></li>
								 <li><a href="imageup" target="mainframe">上传图像</a></li>
								 <li><a href="javascript:void(0);" target="mainframe">密码设置</a></li>
							 </ul>
						</li>
						<li>
							<a href="javascript:void(0);" onclick="doMenu(this)">消&nbsp;&nbsp;&nbsp;&nbsp;息</a>
							 <ul>
								 <li><a href="javascript:void(0);" target="mainframe">重要消息</a></li>
								 <li><a href="javascript:void(0);" target="mainframe">系统消息</a></li>
								 <li><a href="javascript:void(0);" target="mainframe">通知</a></li>
								
							 </ul>
						</li>
						<li>
							<a href="javascript:void(0);" onclick="doMenu(this)">设&nbsp;&nbsp;&nbsp;&nbsp;置</a>
							 <ul>
								 <li><a href="javascript:void(0);" target="mainframe">个人设置</a></li>
								 <li><a href="javascript:void(0);" target="mainframe">高级设置</a></li>
							 </ul>
						</li>
					</ul>
               	</div>
               <div class="box">
					<input type="checkbox" name="" id="checkbox" />
					<label for="checkbox" class="ch">
					</label>
					<div class="backgroung"></div>
			</div>	
            </div>
            <div class="right" id="right">
               
                <iframe name="mainframe" src="${pageContext.request.contextPath}/Passenger/all" frameborder="0" scrolling="yes" width="100%" height="100%"></iframe>
            </div>
        </div> 
     
        
</body>
<script type="text/javascript">
	function doMenu(obj){
		 var items=obj.parentNode.getElementsByTagName("ul");
		 var itmUl;
		 if(items.length>0){
		 	itmUl=items[0];
		 }
		 if(itmUl.className!="ex"){
			 cxAll();
		 	itmUl.className="ex";
		 }else{
		 	itmUl.className="cx";
		 }
	}
	function statUp(){
	 cxAll();
	 //var ulDom=document.getElementById("nav");
	 //var items=ulDom.getElementsByTagName("ul");
	}
	 function cxAll(){
	 var ulDom=document.getElementById("nav");
	 var items=ulDom.getElementsByTagName("ul");
	 for (var i=0;i<items.length;i++)
		 {
			items[i].className="cx";
		 }
	 }
	statUp();
	
	 /* var viewH = document.documentElement.clientHeight;
     console.log(viewH)
     var right = document.getElementById("right");
     right.style.height = (viewH-54)+"px";  */
</script>
</html>
