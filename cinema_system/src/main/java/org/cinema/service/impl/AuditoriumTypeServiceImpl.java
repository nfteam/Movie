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
    public List<AuditoriumType> findList() {
        List<AuditoriumType> list = dao.findList();
        return list;
    }

    @Override
    public String save(AuditoriumType auditoriumType) {
            List<AuditoriumType> list = findByName(auditoriumType);

            if (list.size() > 0) {
                for (AuditoriumType a:list){
                    if (a.getState() == 0) {
                        Cinema cinema = new Cinema();
                        auditoriumType.setTypeId(a.getTypeId());
                        auditoriumType.setState(1);
                        cinema.setCinId(a.getCinema().getCinId());
                        auditoriumType.setAddTime(new Date());
                        auditoriumType.setCinema(cinema);
                        dao.update(auditoriumType);
                        message="添加成功";
                    }else {
                        message = "已存在该数据";
                    }
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
    public List<AuditoriumType> findByName(AuditoriumType auditoriumType) {
         return dao.findByName(auditoriumType);

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
