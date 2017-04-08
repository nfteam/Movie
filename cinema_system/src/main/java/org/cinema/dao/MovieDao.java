package org.cinema.dao;

import org.domian.entity.Movie;

import java.util.List;
import java.util.Map;

/**
 * Created by LIANG on 2017/3/28.
 */
public interface MovieDao extends BaseDao<Movie>{

    public List countMovie();
    public List<Movie> findMovieList(int first ,int max);
    public List<Movie> movieList();
    public List<Movie> findListByCondition(String hql, Map<String,Object> params);
}
