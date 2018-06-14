<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>商品信息管理</h1>
	<table width=550 height=20 border=1 bordercolor=#000000 style="border-collapse:collapse">
		<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>价格</td>
			<td>类别名称</td>
			<td>商品库存</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${goods}" var="g">
			<tr>
				<td>${g.id}</td>
				<td>${g.goods_name}</td>
				<td>${g.goods_price}</td>
				<td>${g.goodstype.name}</td>
				<td>${g.goods_stock}</td>
				<td>
					<a href="${pageContext.request.contextPath}/${g.id}/sys/updateGoods.do">修改</a>
					<a href="${pageContext.request.contextPath}/${g.id}/sys/deleteGoods.do">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
<a href="${pageContext.request.contextPath}/sys/toAddGoods.do"><h2>商品增加</h2></a>
</body>
</html>