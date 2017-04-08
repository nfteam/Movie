package org.cinema.service.impl;

import org.cinema.condition.OrderCondition;
import org.cinema.dao.OrderDao;
import org.cinema.page.PageBean;
import org.cinema.service.OrderService;
import org.domian.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LIANG on 2017/4/1.
 */
@Service("orderService")
@Transactional(propagation = Propagation.REQUIRED)
public class OrderConditionImpl implements OrderService {
    @Autowired
    private OrderDao dao;

    @Override
    public PageBean findOrderSize() {
        PageBean pageBean=new PageBean();
        pageBean.setAllRows(dao.findOrderSize());
        pageBean.setTotalPage(pageBean.getTotalPages());
        return pageBean;
    }

    @Override
    public List<Order> findOrderList(int frist, int max) {
        return dao.findOrderList((frist-1)*max,max);
    }

    @Override
    public List<Order> findOrderByCondition(OrderCondition condition) {
        Map<String,Object> map=new HashMap<>();
        StringBuilder hql=new StringBuilder();
        hql.append("from Order o left join fetch  o.users u left join fetch o.screenings s left join fetch s.auditorium a left join fetch a.cinema c left join fetch s.shelvesSet sh left join fetch sh.movie m left join fetch m.edition where 1=1 and c.cinId=:cinId  ");
        if (condition!=null){
            if (condition.getState()!=null && condition.getState()!=-1){
                hql.append("and o.state=:state ");
                map.put("state",condition.getState());
            }if (condition.getStartTime()!=null && !"".equals(condition.getStartTime())){
                hql.append("and o.addTime >=:startTime ");
                map.put("startTime",condition.getStartTime());
            }if (condition.getEndTime()!=null && !"".equals(condition.getEndTime())){
                hql.append("and o.addTime<=:endTime");
                map.put("endTime",condition.getEndTime());
            }
        }
        System.out.println(hql.toString());
        return dao.findOrderByCondition(hql.toString(),map);
    }
}
