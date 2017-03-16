package org.cinema.dao.impl;

import org.cinema.dao.AuditoriumTypeDao;
import org.domian.entity.AuditoriumType;
import org.domian.entity.Cinema;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by LIANG on 2017/3/14.
 */
@Repository("auditoriumTypeDao")
public class AuditoriumTypeDaoImpl extends BaseDaoImpl<AuditoriumType> implements AuditoriumTypeDao {
    @Override
    public List<Cinema> findList() {
        String hql="from Cinema c left join fetch c.auditoriumTypes t where c.cinId=?1 and t.state='1' order by t.addTime desc ";
        return em.createQuery(hql,Cinema.class).setParameter(1,"b20122f5-693a-4b22-8952-7b56d039d826").getResultList();
    }

    @Override
    public List<Cinema> findByName(AuditoriumType auditoriumType) {
        String hql="from Cinema c left join fetch c.auditoriumTypes t where t.typeName=?1 and c.cinId=?2";
        return em.createQuery(hql,Cinema.class).setParameter(1,auditoriumType.getTypeName()).setParameter(2,"b20122f5-693a-4b22-8952-7b56d039d826").getResultList();
        //return em.createQuery(hql,AuditoriumType.class).setParameter(1,auditoriumType.getTypeName()).getResultList();
    }

    @Override
    public int deleteType(AuditoriumType auditoriumType) {
        String hql="update from AuditoriumType t set t.state=?1 where t.typeId=?2";
        return em.createQuery(hql).setParameter(1,auditoriumType.getState()).setParameter(2,auditoriumType.getTypeId()).executeUpdate();
    }

    public int updateType(AuditoriumType auditoriumType){
        String hql="update from AuditoriumType t set t.typeName=?1 where t.typeId=?2";
        return em.createQuery(hql).setParameter(1,auditoriumType.getTypeName()).setParameter(2,auditoriumType.getTypeId()).executeUpdate();

    }
}
