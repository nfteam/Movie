package org.cinema.dao;

import org.domian.entity.AuditoriumType;

import java.util.List;

/**
 * Created by LIANG on 2017/3/14.
 */
public interface AuditoriumTypeDao extends BaseDao<AuditoriumType> {
    public List<AuditoriumType> findList();
    public List<AuditoriumType> findByName(AuditoriumType auditoriumType);
    public int deleteType(AuditoriumType auditoriumType);
    public int updateType(AuditoriumType auditoriumType);
    public List<AuditoriumType> findtype();
}
