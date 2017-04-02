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
<script src="${pageContext.request.contextPath}/js/ornaments.js"></script>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<!-- <div class="col-md-1 column">
				<ul class="nav nav-pills nav-stacked navbar-inverse">
					<li class="active"><a href="#">饰品</a></li>
					<li><a href="#">魂石</a></li>
					<li><a href="#">宠物</a></li>
					<li><a href="#">VB.Net</a></li>
					<li><a href="#">Java</a></li>
					<li><a href="#">PHP</a></li>
				</ul>
			</div> -->

			<div class="col-md-10 column">
				<table class="table table-condensed table-hover table-bordered">
					<thead>
						<tr id="title">
							<th>名<br>称
							</th>
							<th>攻<br>击
							</th>
							<th>防<br>御
							</th>
							<th>生<br>命<br>上<br>限
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
							<th>反<br>弹<br>伤<br>害
							</th>
							<th>附<br>加<br>伤<br>害
							</th>
							<th>抵<br>挡<br>伤<br>害
							</th>
							<th>击<br>中<br>恢<br>复
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
							<th>替<br>换<br>名<br>称
							</th>
							<th>操<br>作
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ornamentsList}" var="ornaments">
							<tr class="success">
								<td>${ornaments.name}</td>	
								<td>${ornaments.attack}</td>
								<td>${ornaments.defense}</td>
								<td>${ornaments.life}</td>
								<td>${ornaments.lifePerc}</td>
								<td>${ornaments.damagePerc}</td>
								<td>${ornaments.elementPerc}</td>
								<td>${ornaments.excellentPerc}</td>
								<td>${ornaments.excellentProb}</td>
								<td>${ornaments.doubProb}</td>
								<td>${ornaments.rebound}</td>
								<td>${ornaments.additional}</td>
								<td>${ornaments.resist}</td>
								<td>${ornaments.attackRecovery}</td>
								<td>${ornaments.attackRecoveryPerc}</td>
								<td>${ornaments.resistDouble}</td>
								<td>${ornaments.resistExcellent}</td>
								<td>${ornaments.resistLucky}</td>
								<td>${ornaments.medicineRecovery}</td>
								<td>${ornaments.holyRecovery}</td>
								<td>${ornaments.lifeRecovery}</td>
								<td>${ornaments.elementReduce}</td>
								<td>${ornaments.nameReplace}</td>
								<td>
									<button type="button" class="btn btn-default btn-sm">修改</button>
								</td>
							</tr>
						</c:forEach>
						<tr id="insert">
							<td><input type="text" style="height: 25px; width: 60px"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td><input type="text"></td>
							<td>
								<button type="button" class="btn btn-default btn-sm"
									onclick="insert();">插入</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-12 column">
			<ul class="pagination">
				<li><a href="#">Prev</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">Next</a></li>
			</ul>
		</div>
			
		</div>
	</div>
</body>
</html>