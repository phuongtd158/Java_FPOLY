<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col m-auto">
				<a class="btn btn-primary mt-3"
					href="${pageContext.request.contextPath}/admin/account/create">Create</a>
				<table class="table mt-3">
					<thead>
						<tr class="table-dark">
							<td>Id</td>
							<td>Fullname</td>
							<td>Username</td>
							<td>Email</td>
							<td>Photo</td>
							<td>Activated</td>
							<td>Role</td>
							<td colspan="2">Hành động</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${data.content}" var="account">
							<tr>
								<td>${account.id}</td>
								<td>${account.fullName}</td>
								<td>${account.username}</td>
								<td>${account.email}</td>
								<td>${account.photo}</td>
								<td>${account.activated == 1 ? "Activated" : "Inactivated"}</td>
								<td>${account.admin == 1 ? "admin" : "user"}</td>
								<td>
									<a class="btn btn-warning"
									href="${pageContext.request.contextPath}/admin/account/edit/${account.id}">Update</a>
									<a class="btn btn-danger"
									href="${pageContext.request.contextPath}/admin/account/delete/${account.id}">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<nav aria-label="Page navigation example">
					<ul class="pagination">
						<li class="page-item"><a class="page-link"
							href="${pageContext.request.contextPath}/admin/account/index"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
						<li class="page-item"><a class="page-link"
							href="${pageContext.request.contextPath}/admin/account/index?page=${data.number-1}">Pre</a></li>
						<li class="page-item"><a class="page-link"
							href="${pageContext.request.contextPath}/admin/account/index?page=${data.number+1}">Next</a></li>
						<li class="page-item"><a class="page-link"
							href="${pageContext.request.contextPath}/admin/account/index?page=${data.totalPages-1}"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/popper.min.js"></script>
</body>
</html>