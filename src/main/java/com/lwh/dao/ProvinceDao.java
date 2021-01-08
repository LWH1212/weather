package com.lwh.dao;

import com.lwh.entity.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProvinceDao {

    @Select("select * from province")
    List<Province> getProvince();

}
