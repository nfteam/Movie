package org.cinema.dao;

import org.domian.entity.Auditorium;

import java.util.List;

/**
 * Created by LIANG on 2017/3/16.
 */
public interface AuditoriumDao<T> extends BaseDao<Auditorium> {
    public List<T> findAuditor();
    public int delAud(T t);

    public List<Auditorium> findByName(Auditorium auditorium);
}
