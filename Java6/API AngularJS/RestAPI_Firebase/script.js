const app = angular.module('myApp', []);
app.controller('myController', ($scope, $http) => {

    const baseUrl = 'https://poly-java-6-ud-default-rtdb.firebaseio.com';

    $scope.student = {};
    $scope.students = {};
    $scope.films = {};

    $scope.getALlStudents = () => {
        $http.get(baseUrl + '/' + 'student.json')
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
        $http.post(baseUrl + '/' + 'student.json', studentForm)
            .then((response) => {
                $scope.key = response.data.name; //Server luôn trả về 1 name -> gán name vào key
                $scope.students[$scope.key] = studentForm; //Gán student có key vừa trả về vào studentForm
                $scope.reset();
            })
            .catch((error) => {
                console.log(error);
            })
    }

    $scope.edit = (key) => {
        $http.get(baseUrl + '/student/' + key + '.json')
            .then((response) => {
                $scope.student = response.data;
                $scope.key = key;
            })
    }

    $scope.update = () => {
        $http.put(baseUrl + '/student/' + $scope.key + '.json', $scope.student)
            .then((response) => {
                $scope.students[$scope.key] = angular.copy($scope.student);
            })
            .catch((error) => {
                console.log(error);
            })
    }

    $scope.delete = (key) => {
        $http.put(baseUrl + '/student/' + key + '.json', $scope.student)
            .then((response) => {
                delete $scope.students[key];
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

    $scope.getALlStudents()
})