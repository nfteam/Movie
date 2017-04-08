package org.cinema.service;

import org.cinema.condition.OrderCondition;
import org.cinema.page.PageBean;
import org.domian.entity.Order;

import java.util.List;

/**
 * Created by LIANG on 2017/4/1.
 */
public interface OrderService {
    public PageBean findOrderSize();
    public List<Order> findOrderList(int frist ,int max);
    public List<Order> findOrderByCondition(OrderCondition condition);
}
