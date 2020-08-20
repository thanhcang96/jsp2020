<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Loại sản phẩm</title>
</head>
<body>
	<div class="wrapper">
		<h1 style="text-align:center;background-color:green;color:white">Quản lý hệ thống</h1>
		<h2 style="text-align:center">Danh sách loại sản phẩm</h2>
		<a href="ThemLoaiSP">Thêm loại sản phẩm</a>
		<table align="center" border="1">
			<tr>
				<td>ID</td>
				<td>Tên loại sản phẩm</td>
				<td colspan="2">Thao tác</td>
			</tr>
			<c:forEach items="${listLoaiSP}" var="loaisp">
				<tr>
					<td>${loaisp.idLoaiSP}</td>
					<td>${loaisp.tenLoaiSP}</td>
					<td><a href="SuaLoaiSP?id_lsp=${loaisp.idLoaiSP}">Sửa</a></td>
					<td><a href="XoaLoaiSP?id_lsp=${loaisp.idLoaiSP}">Xóa</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>