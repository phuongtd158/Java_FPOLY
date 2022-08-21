<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-5">
            <p class="alert alert-success">${mess}</p>
            <form action="/Lab3/bai1" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="image">Image</label>
                    <input type="file" class="form-control" id="image" name="image">
                </div>
                <div class="form-group">
                    <label for="document">Document</label>
                    <input type="file" class="form-control" id="document" name="document">
                </div>
                <button class="btn btn-primary">Upload</button>
            </form>
        </div>
        <div class="col-md-7">
            <ul>
                <li>
                    Image file: ${image}
                    <img src="upload/${image}" alt="">
                </li>
                <li>
                    Document file:  ${doc}
                    <a href="upload/${doc}">Download</a>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>