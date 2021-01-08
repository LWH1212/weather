package com.lwh.service;


import com.lwh.entity.City;
import com.lwh.entity.Province;

import java.util.List;

/**
 * @author zzc
 * @create 2020-06-01 15:12
 */
public interface CityDataService {
    /**
     * 获取城市列表
     *
     * @return
     * @throws Exception
     */
//    List<City> listCity() throws Exception;

    List<Province> getProvince();

    List<City> getCities(Integer p_id);
}
