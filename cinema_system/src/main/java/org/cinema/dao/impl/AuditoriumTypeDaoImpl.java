package org.cinema.dao.impl;

import org.cinema.dao.AuditoriumTypeDao;
import org.domian.entity.AuditoriumType;
import org.domian.entity.Cinema;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by LIANG on 2017/3/14.
 */
@Repository("auditoriumTypeDao")
public class AuditoriumTypeDaoImpl extends BaseDaoImpl<AuditoriumType> implements AuditoriumTypeDao {
    @Override
    public List<AuditoriumType> findList() {
        String hql="from AuditoriumType a left join fetch a.cinema c where c.cinId=?1 and a.state='1' ";
        return em.createQuery(hql,AuditoriumType.class).setParameter(1,"1").getResultList();
    }

    @Override
    public List<AuditoriumType> findByName(AuditoriumType auditoriumType) {
        String hql="from AuditoriumType a left join fetch a.cinema c where a.typeName=?1 and c.cinId=?2";
        return em.createQuery(hql,AuditoriumType.class).setParameter(1,auditoriumType.getTypeName()).setParameter(2,"1").getResultList();
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

    @Override
    public List<AuditoriumType> findtype() {
        String hql="from AuditoriumType t left join fetch t.cinema c where c.cinId=?1";
        String hql1="from AuditoriumType";
        return em.createQuery(hql,AuditoriumType.class).setParameter(1,"1").getResultList();
    }
}
