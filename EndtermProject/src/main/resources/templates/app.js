var app = angular.module('aitu-project', []);

app.controller('ProductCtrl', function($scope, $http) {
    $scope.productList = [];
    $scope.categoryList = [];

    $scope.getProducts = function() {
        $http({
            url: 'http://127.0.0.1:9090/api/products',
            method: "GET",
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/json"
            }
        })
            .then(function (response) {
                    console.log(response);
                    $scope.productList = response.data;
                },
                function (response) { // optional
                    console.log(response);
                });
    };

    $scope.getCategories = function() {
        $http({
            url: 'http://127.0.0.1:9090/api/categories',
            method: "GET",
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/json"
            }
        })
            .then(function (response) {
                    console.log(response);
                    $scope.categoryList = response.data;
                },
                function (response) { // optional
                    console.log(response);
                });
    };

    $scope.getProductsByCategory = function(categoryId) {
        $http({
            url: 'http://127.0.0.1:9090/api/products/categories/' + categoryId,
            method: "GET",
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/json"
            }
        })
            .then(function (response) {
                    console.log(response);
                    $scope.productList = response.data;
                },
                function (response) { // optional
                    console.log(response);
                });
    };

    $scope.getCategories();
    $scope.getProducts();

});

