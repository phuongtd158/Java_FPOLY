const app = angular.module('myApp', []);
app.controller('myController', ($scope, $http) => {

    const baseUrl = 'http://localhost:8080/demo/rest';

    $scope.student = {};
    $scope.students = [];

    $scope.getALlStudents = () => {
        $http.get(baseUrl + '/' + 'students')
            .then((response) => {
                $scope.students = response.data;
                console.log($scope.students);
            })
            .catch((error) => {
                console.log(error);
            })
    }


    $scope.create = () => {
        var studentForm = angular.copy($scope.student);
        $http.post(baseUrl + '/' + 'students/create', studentForm)
            .then((response) => {
                $scope.students.push(studentForm)

                $scope.reset();
                $scope.reload();
            })
            .catch((error) => {
                console.log(error);
            })
    }

    $scope.reload = () => {
        location.reload();
    }

    $scope.edit = (id) => {
        $http.get(baseUrl + '/students/' + id)
            .then((response) => {
                $scope.student = response.data;
            })
    }

    $scope.update = () => {
        var studentForm = angular.copy($scope.student);
        $http.put(baseUrl + '/students/update/' + studentForm.id, studentForm)
            .then((response) => {
                var index = $scope.students.findIndex(student => student.id == studentForm.id);
                $scope.students[index] = studentForm;
            })
            .catch((error) => {
                console.log(error);
            })
    }

    $scope.delete = (id) => {
        $http.delete(baseUrl + '/students/delete/' + id)
            .then((response) => {
                var index = $scope.students.findIndex(student => student.id == id);
                $scope.students.splice(index, 1);
                $scope.reset();
            })
            .catch((error) => {
                console.log(error);
            })
    }

    $scope.reset = () => {
        $scope.student = {};
        $scope.key = null;
    }

    //Import exel
    $scope.import = (files) => {
        var reader = new FileReader();
        reader.onloadend = async () => {
            var workbook = new ExcelJS.Workbook();
            await workbook.xlsx.load(reader.result);
            console.log(reader.result)
            const worksheet = workbook.getWorksheet('Sheet1');
            worksheet.eachRow((row, index) => {
                if (index > 1) {
                    let student = {
                        email: row.getCell(1).value,
                        fullname: row.getCell(2).value,
                        marks: +row.getCell(3).value,
                        gender: +row.getCell(4).value,
                        country: row.getCell(5).value
                    };
                    var url = baseUrl + "/students/create";
                    $http.post(url, student)
                        .then((response) => {
                            console.log(response.data);
                            $scope.students.push(response.data);
                        })
                        .catch((error) => {
                            console.log(error)
                        })
                };
            });
        };
        reader.readAsArrayBuffer(files[0]);
    };

    //Upload file
    var urlUploadFile = 'http://localhost:8080/demo/rest/files/images';
    $scope.url = (filename) => {
        return `${urlUploadFile}/${filename}`;
    }

    $scope.list = () => {
        $http.get(urlUploadFile)
            .then(response => {
                $scope.filenames = response.data;
            })
            .catch(error => {
                console.log(error)
            })
    }

    $scope.uploadImage = (files) => {
        console.log('uploadImage')
        var form = new FormData();
        for (var i = 0; i < files.length; i++) {
            form.append("files", files[i]);
        }

        $http.post(urlUploadFile, form, {
                transformRequest: angular.identity,
                headers: {
                    'Content-Type': undefined
                }
            })
            .then(response => {
                console.log(response.data)
                $scope.filenames.push(...response.data); //Push tung phan tu vao mang
            })
            .catch(error => {
                console.log(error)
            })
    }

    $scope.deleteImage = (filenames) => {
        $http.delete($scope.url(filenames))
            .then(response => {
                let i = $scope.filenames.findIndex(name => name == filenames);
                $scope.filenames.splice(i, 1);
            })
            .catch(error => {
                console.error(error);
            })
    }

    $scope.list();
    $scope.getALlStudents();
})