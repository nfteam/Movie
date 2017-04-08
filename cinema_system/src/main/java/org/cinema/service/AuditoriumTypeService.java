package org.cinema.service;

import org.domian.entity.AuditoriumType;

import java.util.List;

/**
 * Created by LIANG on 2017/3/14.
 */
public interface AuditoriumTypeService {
    public List<AuditoriumType> findList();
    public String save(AuditoriumType auditoriumType);
    public List<AuditoriumType> findByName(AuditoriumType auditoriumType);
    public String delete(AuditoriumType auditoriumType);
    public AuditoriumType findById(AuditoriumType auditoriumType);
    public String update(AuditoriumType auditoriumType);
}
