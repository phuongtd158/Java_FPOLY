<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-lg bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Navbar</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Dropdown </a>
							<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
								<li><a class="dropdown-item" href="#">Action</a></li>
								<li><a class="dropdown-item" href="#">Another action</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="#">Something else
										here</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link disabled">Disabled</a>
						</li>
					</ul>
					<form class="d-flex" role="search">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>
			</div>
		</nav>
		<div class="row">
			<div class="col-10 m-auto">
				<h3 class="text-center mt-3">Thêm mới người dùng</h3>
				<form action="${pageContext.request.contextPath}/admin/user/store"
					method="post">
					<div class="form-group">
						<label for="id">Mã sinh viên</label> <input type="text"
							class="form-control" name="id" id="id">
					</div>
					<div class="form-group">
						<label for="fullname">Họ tên</label> <input type="text"
							class="form-control" name="fullname" id="fullname">
					</div>
					<div class="form-group">
						<label for="avatar">Avatar</label> <input type="file"
							class="form-control" name="avatar" id="avatar">
					</div>
					<div class="form-group">
						<label for="dob">Ngày sinh</label> <input type="text"
							class="form-control" name="dob" id="dob">
					</div>
					<div class="form-group">
						<label>Giới tính</label>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="male" value="1" checked> <label
								class="form-check-label" for="male">Nam</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="female" value="0"> <label class="form-check-label"
								for="female">Nữ</label>
						</div>
					</div>
					<div class="form-group">
						<label>Chuyên ngành</label> <select class="form-select"
							name="major">
							<option selected disabled>Chọn chuyên ngành</option>
							<option value="UDPM">Ứng dụng phần mềm</option>
							<option value="TKDH">Thiết kế đồ họa</option>
							<option value="MKT">Maketing</option>
						</select>
					</div>
					<button class="btn btn-primary mt-3">Lưu</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>