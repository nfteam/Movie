package org.cinema.service.impl;

import org.cinema.dao.CinemaDao;
import org.cinema.service.CinemaService;
import org.domian.entity2.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LIANG on 2017/2/27.
 */
@Service("cinService")
@Transactional(propagation = Propagation.REQUIRED)
public class CinemaServiceImpl<T> implements CinemaService {
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
}
