package org.domian.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/14.
 * 上架
 */
@Entity
@Table(name = "shelves_info")
public class Shelves {
    private String shelvesId;//id
    private Date addTime;//添加时间
    private String offShelfTime;//下架时间
    private Cinema cinema;//电影院
    private Auditorium auditorium;//影厅
    private Screenings screenings;//场次
    private Movie movie;//电影
    private int state;//状态

    @Id
    @Column(name = "sh_id")
    public String getShelvesId() {
        return shelvesId;
    }

    public void setShelvesId(String shelvesId) {
        this.shelvesId = shelvesId;
    }

    @Column(name = "sh_addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "sh_offTime")
    public String getOffShelfTime() {
        return offShelfTime;
    }

    public void setOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
    }

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @ManyToOne
    @JoinColumn(name = "auditorium_id")
    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @ManyToOne
    @JoinColumn(name = "screenings_id")
    public Screenings getScreenings() {
        return screenings;
    }

    public void setScreenings(Screenings screenings) {
        this.screenings = screenings;
    }

    @ManyToOne
    @JoinColumn(name = "move_id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Column(name = "sh_state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
