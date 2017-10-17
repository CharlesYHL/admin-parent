package com.yhs.admin.restful.service.impl;

import com.yhs.admin.restful.dao.CityDao;
import com.yhs.admin.restful.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;


    public List<Map> findAllCity() {
        return cityDao.findAllCity();
    }


    public Map findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(Map params) {
        return cityDao.saveCity(params);
    }

    @Override
    public Long updateCity(Map params) {
        return cityDao.updateCity(params);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }
}
