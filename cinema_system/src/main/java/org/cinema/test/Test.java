package org.cinema.test;

import org.cinema.dao.AuditoriumTypeDao;
import org.domian.entity.AuditoriumType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by LIANG on 2017/3/22.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AuditoriumTypeDao dao=context.getBean("auditoriumTypeDao",AuditoriumTypeDao.class);
        List<AuditoriumType> list=dao.findtype();
        for (AuditoriumType a:list) {
            System.out.println(a.getTypeName());
        }
        dao.findList();
        System.out.println(list.size());
    }
}
