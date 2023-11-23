<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h3>Danh Sach Book</h3>
	<ul>
		<c:forEach var="b" items="${books}">
			<li>${b.title} <a href="show-form-update/${b.id}">Edit</a> <a href="delete/${b.id}">Delete</a></li>
		</c:forEach>
	</ul>
	<br><br>
	<a href="show-form-insert">Add New Book</a>
</body>
</html>