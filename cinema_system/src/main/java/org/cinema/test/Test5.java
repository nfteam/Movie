package org.cinema.test;

import org.cinema.dao.ScreeningDao;
import org.domian.entity.Screenings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by LIANG on 2017/3/31.
 */
public class Test5 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ScreeningDao dao=context.getBean("screeningDao",ScreeningDao.class);
        List<Screenings> list=dao.findScreeningsList();
        System.out.println(list.size());
    }

}
