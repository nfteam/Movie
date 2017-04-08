package org.cinema.service.impl;

import org.cinema.dao.ScreeningDao;
import org.cinema.service.ScreeningService;
import org.domian.entity.Screenings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LIANG on 2017/3/17.
 */
@Service("screeningService")
@Transactional(propagation = Propagation.REQUIRED)
public class ScreeningServiceImpl implements ScreeningService {
    @Autowired
    private ScreeningDao dao;
    @Override
    public String add(Screenings screenings) {
        dao.save(screenings);
        return "添加成功";
    }
}
