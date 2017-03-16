package org.cinema.service.impl;

import org.cinema.dao.CityDao;
import org.cinema.service.CityService;
import org.domian.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LIANG on 2017/3/13.
 */
@Service("cityService")
@Transactional(propagation = Propagation.REQUIRED)
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao dao;
    @Override
    public List<City> list() {
        List<City> list=dao.city();
        for (City c:list) {
            c.setCinema(null);
        }
        return list;
    }
}
