package com.lwh.service.impl;

import com.lwh.service.WeatherDataService;
import com.lwh.service.WeatherReportService;
import com.lwh.vo.WeatherResponseVO;
import com.lwh.vo.WeatherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zzc
 * @create 2020-06-01 16:09
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataService;

    @Override
    public WeatherVO getDataByCityId(String cityId) {
        WeatherResponseVO responseVO = weatherDataService.getDataByCityId(cityId);
        return responseVO.getData();
    }
}
