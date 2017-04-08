package org.cinema.action;

import org.cinema.service.AuditoriumTypeService;
import org.domian.entity.AuditoriumType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by LIANG on 2017/3/14.
 */
@Controller("auditoriumTypeAction")
@Scope("prototype")
public class AuditoriumTypeAction {
    private AuditoriumType auditoriumType;
    private List<AuditoriumType> list;
    private String message;
    @Autowired
    private AuditoriumTypeService service;

    public List<AuditoriumType> getList() {
        return list;
    }

    public void setList(List<AuditoriumType> list) {
        this.list = list;
    }

    public AuditoriumType getAuditoriumType() {
        return auditoriumType;
    }

    public void setAuditoriumType(AuditoriumType auditoriumType) {
        this.auditoriumType = auditoriumType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String findAuditoriumType(){
        list=service.findList();
        return "success";
    }

    public String add(){
        try{
            message=service.save(auditoriumType);
        }catch (RuntimeException e){
            message="系统异常，请重新提交";
        }
        return "success";
    }


    public String delete(){
        try{
            message=service.delete(auditoriumType);
        }catch (RuntimeException e){
            message="系统异常，请重新提交";
        }
        return "success";
    }

    public String findById(){
        auditoriumType=service.findById(auditoriumType);
        return "success";
    }

    public String update(){
        try{
            message=service.update(auditoriumType);
        }catch (RuntimeException e){
            message="系统异常";
        }
        return "success";
    }
}

