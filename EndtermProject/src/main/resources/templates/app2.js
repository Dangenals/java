var app = angular.module('aitu-project', []);
app.controller('LoginCtrl', function($scope, $http) {
    $scope.customer = {
        customerEmail: '',
        customerPhone: ''
    };


    $scope.login = function(customer) {
        $http({
            url: 'http://127.0.0.1:9090/api/login',
            method: "POST",
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/json"
            },
            data: customer
        })
            .then(function (response) {
                    $scope.customer = response.data;
                    $scope.getMe();
                },
                function (response) { // optional
                    $scope.customer = {}
                });
    };

    $scope.getMe = function(){
        $http({
            url: 'http://127.0.0.1:9090/api/customers/me',
            method: "GET",
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/json",
                "Customer":$scope.customer.token
            }
        })
            .then(function (response) {
                    $scope.customer = response.data;
                },
                function (response) { // optional
                    console.log(response);
                    $scope.customer ={};
                    document.location.href = "http://127.0.0.1:9090/products.html";
                });
    };

});