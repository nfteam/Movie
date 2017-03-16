package org.cinema.dao.impl;

import org.cinema.dao.CityDao;
import org.domian.entity.City;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by LIANG on 2017/3/13.
 */
@Repository("cityDao")
public class CityDaoImpl extends BaseDaoImpl implements CityDao {
    @Override
    public List<City> city() {
        String hql="from City";
        return em.createQuery(hql, City.class).getResultList();
    }
}
