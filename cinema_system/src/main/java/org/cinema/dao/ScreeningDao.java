package org.cinema.dao;

import org.domian.entity.Screenings;

import java.util.List;

/**
 * Created by LIANG on 2017/3/17.
 */
public interface ScreeningDao extends BaseDao<Screenings> {

    public List<Screenings> findScreeningsList();

    public List<Screenings> list();
}
