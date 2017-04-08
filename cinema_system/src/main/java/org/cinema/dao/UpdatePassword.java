package org.cinema.dao;

import org.domian.entity.Manager;

/**
 * Created by LIANG on 2017/3/28.
 */
public interface UpdatePassword extends BaseDao<Manager>{
    public int updatePassword(Manager manager);
}
