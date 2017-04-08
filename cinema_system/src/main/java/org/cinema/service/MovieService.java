package org.cinema.service;

import org.cinema.condition.MovieCondition;
import org.domian.entity.Movie;

import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
public interface MovieService {

    public List<Movie> findMovieCondition(MovieCondition condition);
}
