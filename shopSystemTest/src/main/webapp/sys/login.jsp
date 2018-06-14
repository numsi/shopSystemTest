<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>系统登陆</h1>
	<form action="${pageContext.request.contextPath}/sys/login.do" method="post">
		<table width=250 height=20 border=1 bordercolor=#000000 style="border-collapse:collapse">
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" size="20"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" size="21"></td>
			</tr>
		</table>
		<input type="submit" name="sub" value="登陆">
		<input type="reset" name="reset" value="取消">
	</form> 
</center>
</body>
</html>