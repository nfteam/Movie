package org.cinema.service.impl;

import org.cinema.condition.MovieCondition;
import org.cinema.dao.MovieDao;
import org.cinema.service.MovieService;
import org.domian.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LIANG on 2017/3/28.
 */
@Service("movieService")
@Transactional(propagation = Propagation.REQUIRED)
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao  dao;

    @Override
    public List<Movie> findMovieCondition(MovieCondition condition) {
        Map<String,Object> map=new HashMap<>();
        StringBuilder hql=new StringBuilder();
        hql.append("from Movie m left join fetch m.type t left join fetch m.year y left join fetch m.edition where 1=1 ");
        if (condition!=null){
            if (condition.getTypeId()!=null && condition.getTypeId().equals("-- 请选择 --")!=true){
                hql.append("and t.typeId=:type ");
                map.put("type",condition.getTypeId());
            }
            if (condition.getYearId()!=null && condition.getYearId().equals("-- 请选择 --")!=true){
                hql.append("and y.yearId=:year");
                map.put("year",condition.getYearId());
            }
        }
        System.out.println(hql.toString());
        return dao.findListByCondition(hql.toString(),map);
    }
}
