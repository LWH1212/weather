package com.lwh.entity;

import lombok.Data;

import java.util.List;

@Data
public class Province {

    private Integer id;

    private String province;

    private List<City> cities;

}
