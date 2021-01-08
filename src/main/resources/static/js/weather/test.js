/**
 * report页面下拉框事件
 */

// $(function () {
//     $("#selectProvinceId").change(function () {
//         var provinceId = $("#selectProvinceId").val()
//         var url = '/report/cityId/' + provinceId
//         window.location.href = url
//     })
// });

$(function () {
    var p_id = $("#p_id").val()
    $("#selectProvinceId").change(function () {
        var provinceId = $("#selectProvinceId").val()
        console.log(provinceId);
            var url = '/getCities/' +provinceId
            window.location.href = url
    });

    $("#selectCityId").change(function () {
        var cityId = $("#selectCityId").val()
        console.log(cityId);
        var url = '/getCities/' +p_id+"?cityId="+cityId
        window.location.href = url
    });


});