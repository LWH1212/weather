package com.lwh.service.impl;


import com.lwh.dao.CityDao;
import com.lwh.dao.ProvinceDao;
import com.lwh.entity.City;
//import com.lwh.entity.CityList;
import com.lwh.entity.Province;
import com.lwh.service.CityDataService;
import com.lwh.util.XmlBuilderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author zzc
 * @create 2020-06-01 15:12
 */
@Service
public class CityDataServiceImpl implements CityDataService {

    @Autowired
    ProvinceDao provinceDao;

    @Autowired
    CityDao cityDao;


//    @Override
//    public List<City> listCity() throws Exception {
//        // 读取XML文件
//        Resource resource = new ClassPathResource("citylist.xml");
//        BufferedReader in = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
//        StringBuffer buffer = new StringBuffer();
//        String line = "";
//        while (null != (line = in.readLine())) {
//            buffer.append(line);
//        }
//        in.close();
//        // XML转换为对象
//        CityList cityList = (CityList) XmlBuilderUtil.xmlStrToObject(buffer.toString(), CityList.class);
//        return cityList.getCityList();
//    }

    @Override
    public List<Province> getProvince() {
        return provinceDao.getProvince();
    }

    @Override
    public List<City> getCities(Integer p_id) {
        return cityDao.getCities(p_id);
    }

}
