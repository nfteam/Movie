package org.domian.entity2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/12.
 * 场次
 */
@Entity
@Table(name="s_info")
public class Screenings {
    private String sId;
    private String sTime;
    private double price;
    private Auditorium auditorium;
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

    @Column(name = "s_time")
    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
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

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "screenings")
    public Set<Shelves> getShelvesSet() {
        return shelvesSet;
    }

    public void setShelvesSet(Set<Shelves> shelvesSet) {
        this.shelvesSet = shelvesSet;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "screenings")
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
