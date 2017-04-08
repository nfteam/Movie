package org.cinema.dao.impl;

import org.cinema.dao.MovieDao;
import org.domian.entity.Movie;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by LIANG on 2017/3/28.
 */
@Repository("movieDao")
public class MovieDaoImpl extends BaseDaoImpl<Movie> implements MovieDao {
    @Override
    public List countMovie() {
        String hql="select count(*) from Movie m where m.state=?1";
        Query query=em.createQuery(hql).setParameter(1,1);
        return query.getResultList();
    }

    @Override
    public List<Movie> findMovieList(int first,int max) {
        String hql="from Movie m left join fetch m.year left join fetch m.type left join fetch m.region left join fetch m.edition order by m.addTime desc";
        Query query=em.createQuery(hql);
        query.setFirstResult((first));
        query.setMaxResults(max);
        return query.getResultList();
//        return em.createQuery(hql,Movie.class).getResultList();
    }

    @Override
    public List<Movie> movieList() {
        String hql="from Movie m left join fetch m.year left join fetch m.type left join fetch m.region left join fetch m.edition where m.state>0 order by m.addTime desc";
        return em.createQuery(hql,Movie.class).getResultList();
    }

    @Override
    public List<Movie> findListByCondition(String hql, Map<String, Object> params) {
        Query query=em.createQuery(hql);
        for (String key :params.keySet()){
            query.setParameter(key,params.get(key));
        }
        return query.getResultList();
    }

    public Movie findById(Class<Movie> entityClass, Serializable id){
        String hql="from Movie m left join fetch m.type left join fetch m.region left join fetch m.edition where m.movId=?1";
        return em.createQuery(hql,Movie.class).setParameter(1,id).getSingleResult();
    }
}
