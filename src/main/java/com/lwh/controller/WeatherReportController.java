package com.lwh.controller;

import com.lwh.entity.City;
import com.lwh.entity.Province;
import com.lwh.service.CityDataService;
import com.lwh.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zzc
 * @create 2020-05-31 10:16
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    private CityDataService cityDataService;
    @Autowired
    private WeatherReportService weatherReportService;

//    @GetMapping("/provinceId/{provinceId}")
//    public ModelAndView getReportByProvinceId(@PathVariable("provinceId") Integer provinceId, Model model) throws Exception {
//        model.addAttribute("reportModel.title", "小朱的天气预报");
//        model.addAttribute("reportModel.provinces",cityDataService.getProvince());
//        model.addAttribute("reportModel.cityList", cityDataService.getCities(provinceId));
//        model.addAttribute("reportModel.provinceId", provinceId);
//        return new ModelAndView("weather/report", "reportModel", model);
//    }

    @GetMapping("/cityId/{provinceId}/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, @PathVariable("provinceId") Integer provinceId, Model model) throws Exception {
        model.addAttribute("title", "小朱的天气预报");
        model.addAttribute("provinceList",cityDataService.getProvince());
        model.addAttribute("cityId", cityId);
        List<City> cityList = cityDataService.getCities(provinceId);
//        cityList.get(0).getCityId();
        model.addAttribute("cityList", cityList);
//        model.addAttribute("provinceId", "1");
        model.addAttribute("provinceId", provinceId);

        model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }

    @GetMapping("/{pronvinceId}")
    public ModelAndView getCityByPronviceId(@PathVariable("provinceId") Integer provinceId,Model model){
        model.addAttribute("cityList",cityDataService.getCities(provinceId));
        return new ModelAndView("weather/report", "reportModel", model);
    }
}