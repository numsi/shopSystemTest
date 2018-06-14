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
<form action="${pageContext.request.contextPath}/sys/AddGoods.do" method="post">
	商品名称:<input type="text" name="goods_name"><br>
	价格:<input type="text" name="goods_price" ><br>
	类别名称:<select name="typeid">
		<option value="0">请选择</option>
		<c:forEach items="${goodstypes}" var="t">
			<option value="${t.id}" >${t.name}</option>
		</c:forEach>
	</select><br>
	库存:<input type="text" name="goods_stock" ><br>
	<input type="submit" name="sub" value="增加">
</form>
</body>
</html>