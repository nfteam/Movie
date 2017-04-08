package org.cinema.action;

import org.cinema.dao.YearDao;
import org.domian.entity.Year;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
@Controller("yearAction")
@Scope("prototype")
public class YearAction {

    @Autowired
    private YearDao dao;

    private List<Year> list;

    public List<Year> getList() {
        return list;
    }

    public void setList(List<Year> list) {
        this.list = list;
    }

    public String findYear(){
        list=dao.findYear();
        return "success";
    }
}
