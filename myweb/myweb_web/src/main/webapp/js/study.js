$(function() {

    // 设置页面滚动到顶部
    $("#go-top").click(function() {
        return $("html, body").animate({
            scrollTop:0
        }, 300), !1
    });

    // 侧边栏页面滚动
    $(".i-go").click(function() {
        var value = $(this).text();
        var target = $("#" + value).offset().top;
        return $("html, body").animate({
            scrollTop:target
        }, 300), !1 
    });
});

