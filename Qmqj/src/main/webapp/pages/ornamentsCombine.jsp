<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>全民奇迹饰品</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" >
<script src="${pageContext.request.contextPath}/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ornaments.css">

<script type="text/javascript">

	
</script>



</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-1 column">
				<ul class="nav nav-pills nav-stacked navbar-inverse">
					<li class="active"><a href="#">饰品</a></li>
					<li><a href="#">魂石</a></li>
					<li><a href="#">宠物</a></li>
					<li><a href="#">VB.Net</a></li>
					<li><a href="#">Java</a></li>
					<li><a href="#">PHP</a></li>
				</ul>
			</div>

			<div class="col-md-10 column">
				<table class="table table-condensed table-hover table-bordered">
					<thead>
						<tr id="title">
							<th>饰<br>品<br>组<br>合
							</th>	
							</th>
							<th>生<br>命<br>加<br>成
							</th>
							<th>伤<br>害<br>加<br>成
							</th>
							<th>元<br>素<br>伤<br>害<br>加<br>成
							</th>
							<th>卓<br>越<br>伤<br>害<br>加<br>成
							</th>
							<th>卓<br>越<br>一<br>击<br>几<br>率
							</th>
							<th>致<br>命<br>一<br>击<br>几<br>率
							</th>
							<th>击<br>中<br>恢<br>复<br>加<br>成
							</th>
							<th>抵<br>抗<br>双<br>倍<br>一<br>击
							</th>
							<th>抵<br>抗<br>卓<br>越<br>一<br>击
							</th>
							<th>抵<br>抗<br>幸<br>运<br>一<br>击
							</th>
							<th>药<br>水<br>恢<br>复<br>效<br>果
							</th>
							<th>圣<br>水<br>恢<br>复<br>效<br>果
							</th>
							<th>生<br>命<br>自<br>动<br>回<br>复
							</th>
							<th>元<br>素<br>伤<br>害<br>减<br>免
							</th>
							<th>魔<br>法<br>免<br>疫
							</th>
							<th>物<br>理<br>免<br>疫
							</th>
							<th>闪<br>避
							</th>
							<th>物<br>理<br>魔<br>法<br>伤<br>害<br>减<br>免
							</th>
							<th>特<br>殊<br>伤<br>害<br>减<br>免
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ornamentsCombineList}" var="ornaments">
							<tr class="success">
								<td>${ornaments.combineName}</td>	
								<td>${ornaments.lifePerc}</td>
								<td>${ornaments.damagePerc}</td>
								<td>${ornaments.elementPerc}</td>
								<td>${ornaments.excellentPerc}</td>
								<td>${ornaments.excellentProb}</td>
								<td>${ornaments.doubProb}</td>
								<td>${ornaments.attackRecoveryPerc}</td>
								<td>${ornaments.resistDouble}</td>
								<td>${ornaments.resistExcellent}</td>
								<td>${ornaments.resistLucky}</td>
								<td>${ornaments.medicineRecovery}</td>
								<td>${ornaments.holyRecovery}</td>
								<td>${ornaments.lifeRecovery}</td>
								<td>${ornaments.elementReduce}</td>
								<td>${ornaments.magicImmune}</td>
								<td>${ornaments.physicsImmune}</td>
								<td>${ornaments.avoid}</td>
								<td>${ornaments.magPhyReduce}</td>
								<td>${ornaments.specialReduce}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>