package org.cinema.dao;

import org.domian.entity.Type;

import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
public interface TypeDao extends BaseDao<Type>{
    public List<Type> findType();
}
