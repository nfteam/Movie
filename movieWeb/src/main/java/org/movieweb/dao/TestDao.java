package org.movieweb.dao;

import org.domian.utils.HibernateUtil;

/**
 * Created by LIANG on 2017/1/10.
 */
public class TestDao {
    public static void main(String[] args) {
        System.out.println( HibernateUtil.getEntityManager());
    }
}
