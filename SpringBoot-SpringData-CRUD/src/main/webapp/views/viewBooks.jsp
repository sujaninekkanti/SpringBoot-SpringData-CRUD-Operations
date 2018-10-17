<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Books</title>
<script>
	function confirmDelete() {
		var status = confirm("Are you sure, you want to delete?");
		if (status) {
			return true;
		} else {
			return false;
		}
	}
</script>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th {
	border: 1px solid black;
	border-collapse: collapse;
	background-color: 0000cd;
}

th, td {
	padding: 10px;
	text-align: left;
}
</style>
</head>
<body>

	<%@include file="header.jsp"%>
	<hr />
	<table>
		<thead>
			<tr>
				<th>S.No</th>
				<th>Book Name</th>
				<th>Book ID</th>
				<th>Book Author</th>
				<th>Book Price</th>
				<th>Action(Edit/Delete)</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${books eq null }">
				<tr>
					<td colspan="5">No Records Found</td>
				</tr>
			</c:if>
			<c:forEach items="${books}" var="book" varStatus="index">
				<tr>
					<td><c:out value="${index.count}" /></td>
					<td><c:out value="${book.bookName }" /></td>
					<td><c:out value="${book.bookId }" /></td>
					<td><c:out value="${book.bookAuthor }" /></td>
					<td><c:out value="${book.bookPrice}" /></td>
					<td><a href="edit?bookId=${book.bookId}"><img src="images/edit.png" width="20" height="20" /></a> &nbsp; &nbsp; 
					<a href="delete?bookId=${book.bookId}"><img src="images/delete.png"width="20" height="20" onclick="return confirmDelete()" /> </a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>