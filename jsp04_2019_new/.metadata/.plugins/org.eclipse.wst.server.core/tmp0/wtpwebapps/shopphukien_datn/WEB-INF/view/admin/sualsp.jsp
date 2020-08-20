<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 style="text-align:center">Sửa loại sản phẩm</h2>
	<form method="POST" action="${pageContext.request.contextPath}/SuaLoaiSP">
		<table align="center">
			<tr>
				<td>Mã loại sản phẩm</td>
				<td><input type="hiden" name="idlsp" value="${edit_loaisp.idLoaiSP}" /></td>
			</tr>
			<tr>
				<td>Tên loại sản phẩm</td>
				<td><input type="text" name="tenlsp"  value="${edit_loaisp.tenLoaiSP}"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="submit" style="width:100%"></td>
			</tr>
		</table>
		</form>
</body>
</html>