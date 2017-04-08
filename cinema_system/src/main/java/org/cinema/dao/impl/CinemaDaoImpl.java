package org.cinema.dao.impl;

import org.cinema.dao.CinemaDao;
import org.domian.entity.Cinema;
import org.springframework.stereotype.Repository;

/**
 * Created by LIANG on 2017/2/27.
 */
@Repository("cinDao")
public class CinemaDaoImpl extends BaseDaoImpl<Cinema> implements CinemaDao {

    @Override
    public Cinema findCinema() {
        String hql="from Cinema c left join fetch c.manager m  where m.manId=?1";
        return em.createQuery(hql,Cinema.class).setParameter(1,"1").getSingleResult();
    }
}
