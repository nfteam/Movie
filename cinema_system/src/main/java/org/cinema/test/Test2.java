package org.cinema.test;

import org.cinema.dao.MovieDao;
import org.cinema.dao.impl.MovieDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LIANG on 2017/3/28.
 */
public class Test2 {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieDao dao=new MovieDaoImpl();
//        dao.findListByCondition(1,2,3,5);
    }
}
