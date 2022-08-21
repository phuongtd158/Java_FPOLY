console.log('hello')
const url = 'http://localhost:8080/Practice/admin/user/demo-api';
fetch(url)
    .then((response) => {
        return response.text();
    })
    .then((data) => {
        console.log(data);
    })
    .catch((err) => {
        console.log(err);
    })