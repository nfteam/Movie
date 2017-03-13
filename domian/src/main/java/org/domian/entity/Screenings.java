package org.domian.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/12.
 * 场次
 */
@Entity
@Table(name="s_info")
public class Screenings {
    private String sId;//id
    private Date startTime;//开始时间
    private Date  endTime;//结束时间
    private Date addTime;
    private double price;//价格
    private Auditorium auditorium; //影厅
    private Set<Shelves> shelvesSet=new HashSet<>();
    private Set<Order> orders=new HashSet<>();

    @Id
    @Column(name = "s_id")
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    @Column(name = "start_time")
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Column(name = "end_time")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Column(name = "add_time")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "s_price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @ManyToOne
    @JoinColumn(name = "a_id")
    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "screenings")
    public Set<Shelves> getShelvesSet() {
        return shelvesSet;
    }

    public void setShelvesSet(Set<Shelves> shelvesSet) {
        this.shelvesSet = shelvesSet;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "screenings")
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
