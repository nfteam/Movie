package org.domian.entity2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/12.
 * 影厅
 */
@Entity
@Table(name="a_info")
public class Auditorium {
    private String aId;//id
    private String aName;//名字
    private String aLanguage;//语言
    private String aNumber;//位子数量
    private Cinema cinema;
    private Set<Screenings> screenin=new HashSet<>();
    private Set<Shelves> shelves=new HashSet<>();
    private Set<Order> orders=new HashSet<>();

    @Id
    @Column(name = "a_id")
    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaLanguage() {
        return aLanguage;
    }

    public void setaLanguage(String aLanguage) {
        this.aLanguage = aLanguage;
    }

    public String getaNumber() {
        return aNumber;
    }

    public void setaNumber(String aNumber) {
        this.aNumber = aNumber;
    }

    @ManyToOne
    @JoinColumn(name = "c_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "auditorium")
    public Set<Screenings> getScreenin() {
        return screenin;
    }

    public void setScreenin(Set<Screenings> screenin) {
        this.screenin = screenin;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "auditorium")
    public Set<Shelves> getShelves() {
        return shelves;
    }

    public void setShelves(Set<Shelves> shelves) {
        this.shelves = shelves;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "auditorium")
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
