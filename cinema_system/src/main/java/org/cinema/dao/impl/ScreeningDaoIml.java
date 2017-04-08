package org.cinema.dao.impl;

import org.cinema.dao.ScreeningDao;
import org.domian.entity.Screenings;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LIANG on 2017/3/17.
 */
@Repository("screeningDao")
@Transactional(propagation = Propagation.REQUIRED)
public class ScreeningDaoIml extends BaseDaoImpl<Screenings> implements ScreeningDao {
    @Override
    public List<Screenings> findScreeningsList() {
        String hql="from Screenings s left join fetch s.auditorium a left join fetch a.cinema c where a.state=1 and  c.cinId=?1";
        return em.createQuery(hql,Screenings.class).setParameter(1,"3").getResultList();
    }

    @Override
    public List<Screenings> list() {
        String hql="from Screenings";
        return em.createQuery(hql,Screenings.class).getResultList();
    }
}
