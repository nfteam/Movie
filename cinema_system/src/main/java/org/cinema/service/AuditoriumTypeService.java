package org.cinema.service;

import org.domian.entity.AuditoriumType;
import org.domian.entity.Cinema;

import java.util.List;

/**
 * Created by LIANG on 2017/3/14.
 */
public interface AuditoriumTypeService {
    public List<Cinema> findList();
    public String save(AuditoriumType auditoriumType);
    public List<Cinema> findByName(AuditoriumType auditoriumType);
    public String delete(AuditoriumType auditoriumType);
    public AuditoriumType findById(AuditoriumType auditoriumType);
    public String update(AuditoriumType auditoriumType);
}
