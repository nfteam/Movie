package org.cinema.dao.impl;

import org.cinema.dao.YearDao;
import org.domian.entity.Year;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class YearDaoImpl extends BaseDaoImpl<Year> implements YearDao {
    @Override
    public List<Year> findYear() {
        String hql="from Year";
        return em.createQuery(hql,Year.class).getResultList();
    }
}
