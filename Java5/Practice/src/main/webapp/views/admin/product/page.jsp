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
				<table class="table mt-3">
					<thead>
						<tr class="table-dark">
							<td>STT</td>
							<td>Name</td>
							<td>Category</td>
							<td>Price</td>
							<td>Date</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${data.content}" var="product"
							varStatus="counter">
							<tr>
								<td>${counter.count}</td>
								<td>${product.name}</td>
								<td>${product.categoryById.name}</td>
								<td>${product.price}</td>
								<td>${product.createDate}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<nav aria-label="...">
					<ul class="pagination">
						<li class="page-item"><a class="page-link"
							href="${pageContext.request.contextPath}/admin/product/page">First</a>
						</li>
						<li class="page-item ${data.number == 0 ? 'disabled' : '' }"><a
							class="page-link"
							href="${pageContext.request.contextPath}/admin/product/page?p=${data.number-1}">
								<< </a></li>
						<li
							class="page-item ${data.number == data.totalPages-1 ? 'disabled' : '' }"
							aria-current="page"><a class="page-link"
							href="${pageContext.request.contextPath}/admin/product/page?p=${data.number+1}">
								>> </a></li>
						<li class="page-item"><a class="page-link"
							href="${pageContext.request.contextPath}/admin/product/page?p=${data.totalPages-1}">Last</a>
						</li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</body>
</html>