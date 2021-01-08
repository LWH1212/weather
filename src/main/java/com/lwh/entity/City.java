package com.lwh.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
public class City {

    private Integer id;
    private String cityId;
    private String cityName;
    private String cityCode;
    private Integer p_id;
}
