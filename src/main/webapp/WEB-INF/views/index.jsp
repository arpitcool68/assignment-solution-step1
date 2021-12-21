<%@page language="java" pageEncoding="ISO-8859-1"
		contentType="text/html; ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">

</head>
<body>
<div align="center">
	<h2>Newz Application Assignment</h2>
	<form:form action="/Newz/saveNews" method="post" modelAttribute="news">
		<table border="0" cellpadding="5">
			<tr>
				<td>News Id </td>
				<td><form:input path="newsId" /></td>
			</tr>
			<tr>
				<td>title </td>
				<td><form:input path="title" /></td>
			</tr>
			<tr>
				<td>Author </td>
				<td><form:input path="author" /></td>
			</tr>
			<tr>
				<td>Description </td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td>Content </td>
				<td><form:input path="content" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</div>

<h1></h1>
<table border="2" width="70%" cellpadding="2">
	<tr><th>News ID</th><th>Title</th><th>Author</th><th>Description</th>
		<th>PublishedAt</th>
		<th>Content</th>
		<th></th>
	</tr>
	<c:forEach var="newsList" items="${newsList}">
		<tr>
			<td>${newsList.newsId}</td>
			<td>${newsList.title}</td>
			<td>${newsList.author}</td>
			<td>${newsList.description}</td>
			<td>${newsList.publishedAt}</td>
			<td>${newsList.content}</td>
			<td>
			<td><a href="deleteNews?newsId=${newsList.newsId}">Delete</a></td>
			</td>
		</tr>
	</c:forEach>
</table>
<br/>
</body>
</html>

