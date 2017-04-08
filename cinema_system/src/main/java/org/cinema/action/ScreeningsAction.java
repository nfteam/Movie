package org.cinema.action;

import org.cinema.dao.ScreeningDao;
import org.domian.entity.Screenings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by LIANG on 2017/4/1.
 */
@Controller("screeningAction")
@Scope("prototype")
public class ScreeningsAction {
    private List<Screenings> list;
    @Autowired
    private ScreeningDao dao;

    public List<Screenings> getList() {
        return list;
    }

    public void setList(List<Screenings> list) {
        this.list = list;
    }

    public String list(){
        list=dao.findScreeningsList();
        return "success";
    }
}
