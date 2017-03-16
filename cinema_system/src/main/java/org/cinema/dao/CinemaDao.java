package org.cinema.dao;

import org.domian.entity.Cinema;

/**
 * Created by LIANG on 2017/2/27.
 */
public interface CinemaDao extends BaseDao<Cinema> {

    public Cinema findCinema();
}
