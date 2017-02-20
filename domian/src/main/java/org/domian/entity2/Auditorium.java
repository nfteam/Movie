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
    private String aType;//影厅类型
    private int aNumber;//位子数量
    private int state;//状态
    private String aPhoto;//图片
    private Cinema cinema;//电影院
    private Set<Screenings> screenin=new HashSet<>();
    private Set<Shelves> shelves=new HashSet<>();
    private Set<Order> orders=new HashSet<>();
    private AuditoriumType auditoriumType;


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

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType;
    }

    @Column(name = "a_num")
    public int getaNumber() {
        return aNumber;
    }

    public void setaNumber(int aNumber) {
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

    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Column(name = "a_photo")
    public String getaPhoto() {
        return aPhoto;
    }

    public void setaPhoto(String aPhoto) {
        this.aPhoto = aPhoto;
    }

    @ManyToOne
    @JoinColumn(name="au_ty_id")
    public AuditoriumType getAuditoriumType() {
        return auditoriumType;
    }

    public void setAuditoriumType(AuditoriumType auditoriumType) {
        this.auditoriumType = auditoriumType;
    }
}
