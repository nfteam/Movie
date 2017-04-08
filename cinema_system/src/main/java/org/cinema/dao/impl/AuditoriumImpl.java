package org.cinema.dao.impl;

import org.cinema.dao.AuditoriumDao;
import org.domian.entity.Auditorium;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by LIANG on 2017/3/16.
 */
@Repository("auditoriumDao")
public class AuditoriumImpl extends BaseDaoImpl<Auditorium> implements AuditoriumDao<Auditorium> {

    @Override
    public List findAuditor() {
        String hql="from Auditorium a left join fetch a.cinema c left join fetch a.auditoriumType  where c.cinId=?1  and a.state>0";
        return em.createQuery(hql,Auditorium.class).setParameter(1,"1").getResultList();

    }

    @Override
    public int delAud(Auditorium auditorium) {
        String hql="update from Auditorium a set a.state=0 where a.audId=?1";
        return em.createQuery(hql).setParameter(1,auditorium.getAudId()).executeUpdate();
    }

    @Override
    public List<Auditorium> findByName(Auditorium auditorium) {
        String hql="from Auditorium a left join fetch a.cinema c where a.audName=?1 and c.cinId=?2";
        return em.createQuery(hql,Auditorium.class).setParameter(1,auditorium.getAudName()).setParameter(2,"1").getResultList();
    }

}
