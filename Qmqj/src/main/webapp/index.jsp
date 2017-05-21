<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>尝试</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">

/* function ornaments() {
	$.ajax({
		type : "GET",
		url : "/Qmqj/qmqj/allCombination",
		success : function() {
			window.location.reload()
		}
	});
} */

//$(".submit").()
</script>
</head>
<body>
	<div id="myButtons1" class="bs-example">
   		<!-- <button type="button" class="btn btn-primary ornaments" onclick="ornaments()">导出全部饰品组合</button> -->
   		<a href="/Qmqj/qmqj/allCombination">下载全部饰品组合</a>
   		<a href="/Qmqj/qmqj/findAll">添加饰品</a>
   		<a href="/Qmqj/qmqj/news">测试</a>
   		<form action="/Qmqj/qmqj/upload" method="post" enctype="multipart/form-data"> 
   			<input type="file" name="files" id="file" class="file" multiple="multiple"/>
   			<input type="submit" class="submit" value="提交" />
   		</form>
	</div>
</body>
</html>