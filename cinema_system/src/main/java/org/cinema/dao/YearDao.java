package org.cinema.dao;

import org.domian.entity.Year;

import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
public interface YearDao extends BaseDao<Year> {
    public List<Year> findYear();
}
