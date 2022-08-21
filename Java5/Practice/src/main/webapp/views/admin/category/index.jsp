<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-9 m-auto">
				<form:form
					action="${pageContext.request.contextPath}/admin/category/store"
					method="post" modelAttribute="category">
					<label>Name</label>
					<form:input path="name" class="form-control" />
					<button class="btn btn-primary mt-3">Create</button>
					<button class="btn btn-warning mt-3"
						formaction="${pageContext.request.contextPath}/admin/category/update/${category.id}">Update</button>
					<a class="btn btn-danger mt-3"
						href="${pageContext.request.contextPath}/admin/category/delete/${category.id}">Delete</a>

				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-9 m-auto">
				<table class="table mt-3">
					<thead>
						<tr class="table-dark">
							<td>STT</td>
							<td>Name</td>
							<td colspan="2">Hành động</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listCategory}" var="category"
							varStatus="counter">
							<tr>
								<td>${counter.count}</td>
								<td>${category.name}</td>
								<td><a class="btn btn-warning"
									href="${pageContext.request.contextPath}/admin/category/edit/${category.id}">Edit</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>