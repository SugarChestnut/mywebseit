app.controller("pythonController", function ($scope, pythonService) {

    $scope.pageContent = null;

    $scope.getPage = function () {
        pythonService.getPage().success(function (response) {
            if (response.state) {
                $scope.pageContent = response.pageContent;
            }
            if (!response.state) {
                alert(response.message);
            }
        }).error(function () {
            alert("页面找不到");
        });
    }
});