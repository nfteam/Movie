package org.cinema.service;

import org.domian.entity.Auditorium;

import java.util.List;

/**
 * Created by LIANG on 2017/3/16.
 */
public interface AuditoriumService {

    public List<Auditorium> findAuditor();

    public String add(Auditorium auditorium);

    public String delAud(Auditorium auditorium);

    public void update(Auditorium auditorium);
}
