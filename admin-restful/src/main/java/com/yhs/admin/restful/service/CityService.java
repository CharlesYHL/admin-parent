package com.yhs.admin.restful.service;

import java.util.List;
import java.util.Map;

public interface CityService {
    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<Map> findAllCity();

    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    Map findCityById(Long id);

    /**
     * 新增城市信息
     *
     * @param params
     * @return
     */
    Long saveCity(Map params);

    /**
     * 更新城市信息
     *
     * @param params
     * @return
     */
    Long updateCity(Map params);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param id
     * @return
     */
    Long deleteCity(Long id);
}
