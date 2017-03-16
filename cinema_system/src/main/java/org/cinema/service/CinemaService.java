package org.cinema.service;

import org.domian.entity.Cinema;

/**
 * Created by LIANG on 2017/2/27.
 */
public interface CinemaService {
    public String update(Cinema cinema);

    public Cinema findCinema();
}
