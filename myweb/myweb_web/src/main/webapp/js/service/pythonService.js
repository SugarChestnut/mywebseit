app.service("pythonService", function ($http) {

    this.getPage = function () {
        return $http.get("python/getPage.do");
    }
})