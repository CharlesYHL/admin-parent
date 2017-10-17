package com.yhs.admin.restful.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

// @Mapper
public interface CityDao {
    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<Map> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    Map findById(Long id);

    Long saveCity(Map param);

    Long updateCity(Map param);

    Long deleteCity(Long id);
}
