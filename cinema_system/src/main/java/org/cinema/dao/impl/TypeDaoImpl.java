package org.cinema.dao.impl;

import org.cinema.dao.TypeDao;
import org.domian.entity.Type;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
@Repository("typeDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TypeDaoImpl extends BaseDaoImpl<Type> implements TypeDao {
    @Override
    public List<Type> findType() {
        String hql="from Type";
        return em.createQuery(hql,Type.class).getResultList();
    }
}
