package org.cinema.action;

import org.cinema.dao.AuditoriumDao;
import org.cinema.service.AuditoriumService;
import org.cinema.service.ScreeningService;
import org.domian.entity.Auditorium;
import org.domian.entity.AuditoriumType;
import org.domian.entity.Cinema;
import org.domian.entity.Screenings;
import org.domian.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * Created by LIANG on 2017/3/16.
 */

@Controller("auditoriumAction")
@Scope("prototype")
public class AuditoriumAction {

    private Auditorium auditorium;
    private List<Auditorium> list;
    //    private Screenings screenings;
    private AuditoriumType auditoriumType;
    private Cinema cinema;

    private String[] endTime;
    private String[] startTime;

    private String message;
    @Autowired
    private AuditoriumService service;
    @Autowired
    private AuditoriumDao<Auditorium> dao;

    @Autowired
    private ScreeningService screeningService;

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public List<Auditorium> getList() {
        return list;
    }

    public void setList(List<Auditorium> list) {
        this.list = list;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AuditoriumType getAuditoriumType() {
        return auditoriumType;
    }

    public void setAuditoriumType(AuditoriumType auditoriumType) {
        this.auditoriumType = auditoriumType;
    }

    public String[] getEndTime() {
        return endTime;
    }

    public void setEndTime(String[] endTime) {
        this.endTime = endTime;
    }

    public String[] getStartTime() {
        return startTime;
    }

    public void setStartTime(String[] startTime) {
        this.startTime = startTime;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public String findAuditorByList() {
        list = service.findAuditor();
        for (Auditorium aud: list){
//          aud.setAuditoriumType(null);
//          aud.setCinema(null);
//          aud.setScreeningss(null);
//          aud.setOrders(null);
//          aud.setShelves(null);
        }
        return "success";
    }

    public String delAud(){
        message=service.delAud(auditorium);
        return "success";
    }

    public String add() {
        try{
            String time;
            String start;
            if (endTime != null || startTime != null) {
                Screenings screenings = new Screenings();
                for (int n = 0; n < endTime.length; n++) {
                    time=endTime[n];
                    start=startTime[n];
                    screenings.setScrId(UUIDUtil.getUUID());
                    screenings.setAddTime(new Date());
                    screenings.setEndTime(Time.valueOf(time));
                    screenings.setStartTime(Time.valueOf(start));
                    screenings.setAuditorium(auditorium);
                    System.out.println(screenings.getEndTime());
                    auditorium.setAudId(UUIDUtil.getUUID());
                    auditorium.getScreeningss().add(screenings);
                    auditorium.setAuditoriumType(auditoriumType);
                    message=service.add(auditorium);
                    screeningService.add(screenings);
                }

            } else {
                auditorium.setAudId(UUIDUtil.getUUID());
                auditorium.setAuditoriumType(auditoriumType);
                message=service.add(auditorium);
            }
        }catch (RuntimeException e){
            message="添加异常！";
        }


        return "success";
    }

    public String findByAud(){
//        System.out.println(auditorium.getAudId());
        auditorium=dao.findById(Auditorium.class,auditorium.getAudId());
//        auditorium.getAuditoriumType().setAuditoriums(null);
////        auditorium.setShelves(null);
//        auditorium.getCinema().setAuditoriums(null);
////        auditorium.getCinema().setAuditoriumTypes(null);
////        auditorium.getCinema().setShelves(null);
//        auditorium.getCinema().setCity(null);
////        auditorium.getCinema().setOrders(null);
//        auditorium.getCinema().setManager(null);
////        auditorium.setOrders(null);
//        auditorium.setScreeningss(null);
//        System.out.println(auditorium.getAudName());
        return "success";
    }


    public String update(){
        auditorium.setCinema(cinema);
        auditorium.setAuditoriumType(auditoriumType);
        try{
            service.update(auditorium);
            message="更新成功";
        }catch (RuntimeException e){
            message="更新异常";
        }
        return "success";
    }
}
