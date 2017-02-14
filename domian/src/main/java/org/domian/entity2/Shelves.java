package org.domian.entity2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/14.
 * 上架
 */
@Entity
@Table(name = "sh_info")
public class Shelves {
    private String sId;
    private Date addTime;
    private String offShelfTime;
    private Cinema cinema;
    private Auditorium auditorium;
    private Screenings screenings;
    private Movie movie;
    private int state;

    @Id
    @Column(name = "sh_id")
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    @Column(name = "s_addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "s_offTime")
    public String getOffShelfTime() {
        return offShelfTime;
    }

    public void setOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
    }

    @ManyToOne
    @JoinColumn(name = "c_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @ManyToOne
    @JoinColumn(name = "a_id")
    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @ManyToOne
    @JoinColumn(name = "s_id")
    public Screenings getScreenings() {
        return screenings;
    }

    public void setScreenings(Screenings screenings) {
        this.screenings = screenings;
    }

    @ManyToOne
    @JoinColumn(name = "m_id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Column(name = "s_state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
