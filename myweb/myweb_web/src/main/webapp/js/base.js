/**
 * 
 */

var app = angular.module('myApp',['ngSanitize']);

/*过滤器*/
app.filter("trustHtml", ["$sce", function($sce) {
    return function(data) {
        return $sce.trustAsHtml(data);
    }
}]);