package org.cinema.test;

import org.cinema.service.OrderService;
import org.domian.entity.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by LIANG on 2017/3/31.
 */
public class Test4 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService dao=context.getBean("orderService",OrderService.class);
//        List<Order> list=dao.findOrderList();
//        for (Order c:list) {
//            System.out.println(c.getScreenings().getAuditorium().getCinema().getCinName());
//            for (Shelves sh:c.getScreenings().getShelvesSet()) {
//                System.out.println(sh.getScreenings().getStartTime());
//                System.out.println("___________"+sh.getMovie().getMovName());
//            }
//        }
//        System.out.println(list.size());

//        System.out.println(dao.findOrderSize());
        List<Order> list=dao.findOrderList(1,2);
        for (Order o:list) {
            System.out.println(o.getOrderId());
        }
        System.out.println(list.size());
    }


}
