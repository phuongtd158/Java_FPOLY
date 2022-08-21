<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <h1>Đăng ký</h1>
        <div class="col-7">
            <form action="register" method="post">
                <div class="form-group">
                    <label for="name">Tên đăng nhập</label>
                    <input type="text" class="form-control" name="name" id="name">
                </div>
                <div class="form-group">
                    <label for="password">Mật khẩu</label>
                    <input type="password" class="form-control" name="password" id="password">
                </div>
                <div class="form-group">
                    <label>Giới tính</label>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" checked id="male" value="true">
                        <label class="form-check-label" for="male">Nam</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="female" value="false">
                        <label class="form-check-label" for="female">Nữ</label>
                    </div>
                </div>
                <div class="form-group">
                    <input type="checkbox" name="married"> Đã có gia đình chưa ?
                </div>
                <div class="form-group">
                    <select name="country" class="form-select" id="country">
                        <option value="VN">Viet nam</option>
                        <option value="Lao">Lao</option>
                        <option value="Campuchia">Campuchia</option>
                    </select>
                </div>
                <div class="form-group">
                    <input type="checkbox" name="hobbies" value="Doc sach">Đọc sách
                    <input type="checkbox" name="hobbies" value="Am nhac">Âm nhạc
                    <input type="checkbox" name="hobbies" value="Du lich">Du lịch
                </div>
                <label>Ghi chú</label>
                <div class="form-floating">
                    <textarea name="note" class="form-control" cols=" 30" rows="10"></textarea>
                </div>
                <button class="btn btn-primary">Register</button>
            </form>
        </div>
        <div class="col-5">
            <ul class="list-unstyled">
                <li>Name: ${name}</li>
                <li>Password: ${password}</li>
                <li>Gender: ${gender}</li>
                <li>Country: ${country}</li>
                <li>Married: ${married}</li>
                <li>Hobbies: ${hobbies}</li>
                <li>Note: ${notes}</li>
            </ul>
        </div>
    </div>

</div>
</body>
</html>
