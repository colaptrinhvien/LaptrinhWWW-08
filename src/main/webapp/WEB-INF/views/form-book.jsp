<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Book</title>
</head>
<body>
	<form:form modelAttribute="book" action="/VuTienDuc_DeCuaNhung/update" method="post">
		<form:hidden path="id" />
		<label>Title</label>
		<form:input path="title" />
		<label>Author</label>
		<form:input path="author" />
		<label>Category</label>
		<form:input path="category" />
		<label>Quantity</label>
		<form:input path="quantity" />
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>