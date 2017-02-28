package org.ciemasystem.dao.impl;

import org.ciemasystem.dao.BaseDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by LIANG on 2017/2/27.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
    //注入一个entityManager
    @PersistenceContext
    protected EntityManager em;
    @Override
    public void save(T t) {
        em.persist(t);
    }

    @Override
    public void delete(T t) {
        em.remove(t);
    }

    @Override
    public void update(T t) {
        em.merge(t);
    }

    @Override
    public T findById(Class<T> entityClass, Serializable id) {
        return em.find(entityClass,id);
    }
}
