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

/* $(".submit").click(function(){
	
}) */
/* 另外一种提交方式，formData */

function submit1(){
	var form = new FormData(document.getElementById("formData"));
	//alert(form)
    $.ajax({
        url:"/Qmqj/qmqj/upload",
        type:"post",
        data:form,
        processData:false,
        contentType:false,
        success:function(data){
            console.log("over..");
        },
        error:function(e){
            alert("错误！！");
        }
    }); 
}5
function test(){
	var login={
			userName:$(".userName").val(),
			passWord:$(".passWord").val(),
			}
	console.log(login)
	$.ajax({
        url:"/Qmqj/qmqj/login",
        type:"POST",
        dataType:'text',
        data:login,
        success:function(backData){
        	alert(backData)
        	$(".currentTime").val(backData);
        	 var form = new FormData(document.getElementById("formData"));
            $.ajax({
                url:"/Qmqj/qmqj/upload",
                type:"post",
                data:form,
                processData:false,
                contentType:false,
                success:function(data){
                    console.log("over..");
                },
                error:function(e){
                    alert("错误！！");
                }
            }); 
        },
        error:function(e){
            alert("错误！！");
        }
    });
	
    
}
</script>
</head>
<body>1
	<div id="myButtons1" class="bs-example">
   		<!-- <button type="button" class="btn btn-primary ornaments" onclick="ornaments()">导出全部饰品组合</button> -->
   		<a href="/Qmqj/qmqj/allCombination">下载全部饰品组合</a>
   		<a href="/Qmqj/qmqj/findAll">添加饰品</a>
   		<a href="/Qmqj/qmqj/news">测试</a>
   		<!-- style="display: none" -->
   		<form action="" method="post" enctype="multipart/form-data" id="formData"> 
   			<input type="text" name="currentTime" class="currentTime" />
   			<input type="file" name="files" id="file" class="file" multiple="multiple"/>
   			<input type="submit" class="submit" value="提交" onclick="return submit1();" /> 
   		</form>
   		
   		
   		<input type="text" class="userName"/>
   		<input type="text" class="passWord"/>
   		<input type="button" value="提交" onclick="test()"/>
	</div>
</body>
</html>