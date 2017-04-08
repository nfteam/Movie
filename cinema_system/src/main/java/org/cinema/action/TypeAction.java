package org.cinema.action;

import org.cinema.dao.TypeDao;
import org.domian.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by LIANG on 2017/3/28.
 */
@Controller("typeAction")
@Scope("prototype")
public class TypeAction {

    public List<Type> list;
    @Autowired
    private TypeDao dao;

    public List<Type> getList() {
        return list;
    }

    public void setList(List<Type> list) {
        this.list = list;
    }


    public String findType(){
        list=dao.findType();
        return "success";
    }
}
