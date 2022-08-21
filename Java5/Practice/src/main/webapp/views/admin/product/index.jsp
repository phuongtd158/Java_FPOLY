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
					action="${pageContext.request.contextPath}/admin/product/store"
					method="post" modelAttribute="productModel">
					<label>Name</label>
					<form:input path="name" class="form-control" />
					<label>Category</label>
					<form:select path="categoryById" class="form-select">
						<c:forEach items="${listCategories}" var="category">
							<option value="${category.id}"
								${category.id == cateId ? 'selected' : ''}>
								${category.name}</option>
						</c:forEach>
					</form:select>
					<label>Price</label>
					<form:input path="price" class="form-control" />
					<label>Date</label>
					<form:input path="createDate" class="form-control" />
					<button class="btn btn-primary mt-3">Create</button>
					<button class="btn btn-warning mt-3"
						formaction="${pageContext.request.contextPath}/admin/product/update/${productModel.id}">Update</button>
					<a class="btn btn-danger mt-3"
						href="${pageContext.request.contextPath}/admin/product/delete/${productModel.id}">Delete</a>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-9 m-auto">
				<table class="table mt-3">
					<thead>
						<tr class="table-dark">
							<td>STT</td>
							<td><a style="color: white;"
								href="${pageContext.request.contextPath}/admin/product/index?sort-field=name">Name</a></td>
							<td><a style="color: white;"
								href="${pageContext.request.contextPath}/admin/product/index?sort-field=categoryById">Category</a></td>
							<td><a style="color: white;"
								href="${pageContext.request.contextPath}/admin/product/index?sort-field=price">Price</a></td>
							<td><a style="color: white;"
								href="${pageContext.request.contextPath}/admin/product/index?sort-field=createDate">Date</a></td>
							<td colspan="2">Hành động</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listProducts}" var="product"
							varStatus="counter">
							<tr>
								<td>${counter.count}</td>
								<td>${product.name}</td>
								<td>${product.categoryById.name}</td>
								<td>${product.price}</td>
								<td>${product.createDate}</td>
								<td><a class="btn btn-warning"
									href="${pageContext.request.contextPath}/admin/product/edit/${product.id}">Edit</a>
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