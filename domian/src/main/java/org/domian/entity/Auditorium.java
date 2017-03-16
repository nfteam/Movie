package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/12.
 * 影厅
 */
@Entity
@Table(name="auditorium_info")
public class Auditorium {
    private String audId;//id
    private String audName;//名字
    private int audNumber;//位子数量
    private int state;//状态
    private String audPhoto;//图片
    private Cinema cinema;//电影院
    private Set<Screenings> screeningss=new HashSet<>();
    private Set<Shelves> shelves=new HashSet<>();
    private Set<Order> orders=new HashSet<>();
    private AuditoriumType auditoriumType;


    @Id
    @Column(name = "aud_id")
    public String getAudId() {
        return audId;
    }

    public void setAudId(String audId) {
        this.audId = audId;
    }

    @Column(name = "aud_name")
    public String getAudName() {
        return audName;
    }

    public void setAudName(String audName) {
        this.audName = audName;
    }

    @Column(name = "aud_num")
    public int getAudNumber() {
        return audNumber;
    }

    public void setAudNumber(int audNumber) {
        this.audNumber = audNumber;
    }

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "auditorium")
    public Set<Screenings> getScreeningss() {
        return screeningss;
    }

    public void setScreeningss(Set<Screenings> screeningss) {
        this.screeningss = screeningss;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "auditorium")
    public Set<Shelves> getShelves() {
        return shelves;
    }

    public void setShelves(Set<Shelves> shelves) {
        this.shelves = shelves;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "auditorium")
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Column(name = "aud_photo")
    public String getAudPhoto() {
        return audPhoto;
    }

    public void setAudPhoto(String audPhoto) {
        this.audPhoto = audPhoto;
    }

    @ManyToOne
    @JoinColumn(name="aud_ty_id")
    public AuditoriumType getAuditoriumType() {
        return auditoriumType;
    }

    public void setAuditoriumType(AuditoriumType auditoriumType) {
        this.auditoriumType = auditoriumType;
    }
}
