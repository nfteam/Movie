package org.cinema.dao.impl;

import org.cinema.dao.CinemaDao;
import org.domian.entity.Cinema;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by LIANG on 2017/2/27.
 */
@Repository("cinDao")
public class CinemaDaoImpl extends BaseDaoImpl<Cinema> implements CinemaDao {


    @Override
    public Cinema findCinema() {
        String hql="from Cinema c left join fetch c.city where c.cinId=?1";
        return em.createQuery(hql,Cinema.class).setParameter(1,"b20122f5-693a-4b22-8952-7b56d039d826").getSingleResult();
    }
}
