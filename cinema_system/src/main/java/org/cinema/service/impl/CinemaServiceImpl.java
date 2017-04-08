package org.cinema.service.impl;

import org.cinema.dao.CinemaDao;
import org.cinema.service.CinemaService;
import org.domian.entity.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LIANG on 2017/2/27.
 */
@Service("cinService")
@Transactional(propagation = Propagation.REQUIRED)
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaDao dao;

    @Override
    public String update(Cinema cinema) {
        String message=null;
        try{
            dao.update(cinema);
            message="更新成功";
        }catch (RuntimeException e){
            e.printStackTrace();
            message="更新失败";
            throw e;
        }
        return message;
    }

    @Override
    public Cinema findCinema() {
        Cinema cinema=dao.findCinema();
//        cinema.setOrders(null);
//        cinema.setShelves(null);
        cinema.setAuditoriums(null);
        cinema.getCity().setCinema(null);
        return cinema;
    }


}
