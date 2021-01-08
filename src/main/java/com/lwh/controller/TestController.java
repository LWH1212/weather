package com.lwh.controller;

import com.lwh.entity.City;
import com.lwh.entity.Province;
import com.lwh.service.CityDataService;
import com.lwh.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    CityDataService cityDataService;

    @Autowired
    private WeatherReportService weatherReportService;

//    @GetMapping("getCities/{provinceId}")
//    public String getCities(@PathVariable Integer provinceId, @RequestParam(value = "cityId",defaultValue = "101010100") String cityId, Model model){
//        List<Province> provinceList = cityDataService.getProvince();
//        List<City> cityList = cityDataService.getCities(provinceId);
//        model.addAttribute("provinceList",provinceList);
//        model.addAttribute("cityList",cityList);
//        model.addAttribute("provinceId",provinceId);
//        return "weather/test";
//    }

    @GetMapping("getCities/{provinceId}")
    public ModelAndView getCities(@PathVariable Integer provinceId, @RequestParam(name = "cityId", required = true, defaultValue = "101010100") String cityId, Model model, HttpSession session){
        List<Province> provinceList = cityDataService.getProvince();
        List<City> cityList = cityDataService.getCities(provinceId);
        model.addAttribute("cityId", cityId);
        model.addAttribute("title", "小朱的天气预报");
        model.addAttribute("provinceList",provinceList);
        model.addAttribute("cityList",cityList);
        model.addAttribute("provinceId",provinceId);
        session.setAttribute("provinceId",provinceId);
        model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }

}
