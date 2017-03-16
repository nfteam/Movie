package org.cinema.service.impl;

import org.cinema.dao.AuditoriumTypeDao;
import org.cinema.service.AuditoriumTypeService;
import org.domian.entity.AuditoriumType;
import org.domian.entity.Cinema;
import org.domian.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by LIANG on 2017/3/14.
 */
@Service("auditoriumTypeService")
@Transactional(propagation = Propagation.REQUIRED)
public class AuditoriumTypeServiceImpl implements AuditoriumTypeService {
    @Autowired
    private AuditoriumTypeDao dao;
    private String message;

    @Override
    public List<Cinema> findList() {
        List<Cinema> list = dao.findList();
        for (Cinema type : list) {
            type.setAuditoriums(null);
            type.setManager(null);
            type.setOrders(null);
            type.setShelves(null);
            type.getCity().setCinema(null);
            for (AuditoriumType a : type.getAuditoriumTypes()) {
                a.setAuditoriums(null);
            }
        }
        return list;
    }

    @Override
    public String save(AuditoriumType auditoriumType) {

            List<Cinema> list = findByName(auditoriumType);
            Cinema cinema = new Cinema();
            if (list.size() > 0) {
                for (Cinema c : list) {
                    cinema.setCinId(c.getCinId());
                    for (AuditoriumType t : c.getAuditoriumTypes()) {
                        auditoriumType.setState(t.getState());
                        auditoriumType.setTypeId(t.getTypeId());
                        auditoriumType.setCinema(cinema);
                    }
                }
                if (auditoriumType.getState() == 0) {
                    auditoriumType.setState(1);
                    auditoriumType.setAddTime(new Date());
                    dao.update(auditoriumType);
                    message="添加成功";
                }else {
                    message = "已存在该数据";
                }
            } else {
                auditoriumType.setTypeId(UUIDUtil.getUUID());
                auditoriumType.setState(1);
                auditoriumType.setAddTime(new Date());
                dao.save(auditoriumType);
//                System.out.println(10/0);
                message = "添加成功";
            }
        return message;
    }

    @Override
    public List<Cinema> findByName(AuditoriumType auditoriumType) {
        List<Cinema> list = dao.findByName(auditoriumType);
//        System.out.println(list.size());
        return list;
    }

    @Override
    public String delete(AuditoriumType auditoriumType) {
        auditoriumType.setState(0);
        int n=dao.deleteType(auditoriumType);
        message =n == 0 ? "失败" : "成功";

        return message ;
    }

    @Override
    public AuditoriumType findById(AuditoriumType auditoriumType) {
        auditoriumType= dao.findById(AuditoriumType.class,auditoriumType.getTypeId());
        return auditoriumType;
    }

    @Override
    public String update(AuditoriumType auditoriumType) {
        int n=dao.updateType(auditoriumType);
        message =n == 0 ? "失败" : "成功";
        return message ;
    }


}
