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
<h1>商品类别管理</h1>
	<table width=250 height=20 border=1 bordercolor=#000000 style="border-collapse:collapse">
		<tr>
			<td>类别编号</td>
			<td>类别名称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${types}" var="t">
			<tr>
				<td>${t.id}</td>
				<td>${t.name}</td>
				<td>
					<a href="${pageContext.request.contextPath}/${t.id}/sys/updateType.do">修改</a>
					<a href="${pageContext.request.contextPath}/${t.id}/sys/deleteType.do">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
<a href="addType.jsp"><h2>类别增加</h2></a>
</body>
</html>