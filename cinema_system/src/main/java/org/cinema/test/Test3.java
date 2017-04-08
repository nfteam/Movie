package org.cinema.test;

import org.cinema.service.MovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LIANG on 2017/3/28.
 */
public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieService dao=context.getBean("movieService",MovieService.class);

    }
}
