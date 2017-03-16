package org.cinema.action;

import org.cinema.service.CinemaService;
import org.cinema.service.CityService;
import org.domian.entity.Cinema;
import org.domian.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by LIANG on 2017/2/27.
 */
@Controller("cinAction")
@Scope("prototype")
public class CinemaAction {
    private Cinema cinema;
    private String message;
    private City city;
    private List<City> list;
    private List<Cinema> clist;
    @Autowired
    private CinemaService service;
    @Autowired
    private CityService cityService;

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

    public List<City> getList() {
        return list;
    }

    public void setList(List<City> list) {
        this.list = list;
    }

    public List<Cinema> getClist() {
        return clist;
    }

    public void setClist(List<Cinema> clist) {
        this.clist = clist;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String update(){
        cinema.setCity(city);
        message=service.update(cinema);
        return "success";
    }

   public String city(){
        list=cityService.list();
        return "success";
   }

   public String findCinema(){
       cinema=service.findCinema();
       return "success";
   }
}
