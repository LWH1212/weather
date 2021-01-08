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
    $("#selectProvinceId").change(function () {
        var provinceId = $("#selectProvinceId").val()
        // var url='/report/'+provinceId
        console.log(provinceId);
        // var cityId = $("#selectCityId").val()
        // var url = '/report/cityId/' +provinceId+"/"+cityId
        window.location.href = url
    })
});