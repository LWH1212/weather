package com.lwh.dao;

import com.lwh.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityDao {

    @Select("select * from city where p_id=#{p_id}")
    List<City> getCities(Integer p_id);

}
