package org.cinema.action;

import org.cinema.condition.OrderCondition;
import org.cinema.dao.OrderDao;
import org.cinema.page.PageBean;
import org.cinema.service.OrderService;
import org.domian.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by LIANG on 2017/3/31.
 */
@Controller("orderAction")
@Scope("prototype")
public class OrderAction {
    @Autowired
    private OrderDao dao;
    @Autowired
    private OrderService service;
    private List<Order> list;
    private OrderCondition orderCondition;
    private PageBean pageBean;
    private int currentPage;
    private int pageSize = 2;

    public List<Order> getList() {
        return list;
    }

    public void setList(List<Order> list) {
        this.list = list;
    }

    public OrderCondition getOrderCondition() {
        return orderCondition;
    }

    public void setOrderCondition(OrderCondition orderCondition) {
        this.orderCondition = orderCondition;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String findOrder(){
        list= dao.findOrderList(0,4);
        return "success";
    }

    public String OrderSize(){
        pageBean=service.findOrderSize();
        return "success";
    }

    public String findOrderByCondition(){
        list=service.findOrderByCondition(orderCondition);
        return "success";
    }
}
