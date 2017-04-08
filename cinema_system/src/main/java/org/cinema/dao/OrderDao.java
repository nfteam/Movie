package org.cinema.dao;

import org.domian.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * Created by LIANG on 2017/3/31.
 */
public interface OrderDao extends BaseDao<Order>{
    public List<Order> findOrderList(int frist,int max);
    public int findOrderSize();
    public List<Order> findOrderByCondition(String hql, Map<String,Object> params);
}
