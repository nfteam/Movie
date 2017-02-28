package org.cinema.action;

import org.cinema.service.CinemaService;
import org.domian.entity.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by LIANG on 2017/2/27.
 */
@Controller("cinAction")
@Scope("prototype")
public class CinemaAction {
    private Cinema cinema;
    private String message;
    @Autowired
    private CinemaService service;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public String update(){
        message=service.update(cinema);
        return "success";
    }

    public String add(){
        return "success";
    }
}
