package org.cinema.service.impl;

import org.cinema.dao.AuditoriumDao;
import org.cinema.service.AuditoriumService;
import org.domian.entity.Auditorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LIANG on 2017/3/16.
 */
@Service("auditoriumService")
@Transactional(propagation = Propagation.REQUIRED)
public class AuditoriumServiceImpl implements AuditoriumService {
    @Autowired
    private AuditoriumDao dao;
    @Override
    public List<Auditorium> findAuditor() {
        return dao.findAuditor();
    }

    @Override
    public String add(Auditorium auditorium) {
        List<Auditorium> list=dao.findByName(auditorium);
        System.out.println(list.size());
        String message=null;
        if (list.size()!=0){
            for (Auditorium a:list) {
                if (a.getState()>0){
                    message="已存在改数据";
                }else {
                    dao.save(auditorium);
                    message="添加成功";
                }
            }
        }else {
            dao.save(auditorium);
            message="添加成功";
        }
        return message;
    }

    @Override
    public String delAud(Auditorium auditorium) {
        int n=dao.delAud(auditorium);
        String message = n > 1 ? "删除失败" : "删除成功";
        return message;
    }

    @Override
    public void update(Auditorium auditorium) {
        dao.update(auditorium);
    }
}
