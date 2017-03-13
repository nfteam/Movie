package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/12.
 * 电影院
 */
@Entity
@Table(name="c_info")
public class Cinema {
    private String cId;//id
    private String cName;//名字
    private String cPhoto;//图片
    private String cAddress;//地址
    private String cTell;//电话
    private String email;
    private String cIntroduction;//简介
    private City city; //城市，多对一
    private Manager manager;
    private int state;
    private Set<Auditorium> auditoriums=new HashSet<>();
    private Set<Shelves> shelves=new HashSet<>();
    private Set<Order> orders=new HashSet<>();

    @Id
    @Column(name="c_id")
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Column(name = "c_name")
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Column(name = "c_photo")
    public String getcPhoto() {
        return cPhoto;
    }

    public void setcPhoto(String cPhoto) {
        this.cPhoto = cPhoto;
    }

    @Column(name = "c_address")
    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    @Column(name = "c_tell")
    public String getcTell() {
        return cTell;
    }

    public void setcTell(String cTell) {
        this.cTell = cTell;
    }

    @Column(name = "c_Introduction")
    public String getcIntroduction() {
        return cIntroduction;
    }

    public void setcIntroduction(String cIntroduction) {
        this.cIntroduction = cIntroduction;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cinema")
    public Set<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(Set<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cinema")
    public Set<Shelves> getShelves() {
        return shelves;
    }

    public void setShelves(Set<Shelves> shelves) {
        this.shelves = shelves;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cinema")
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @ManyToOne
    @JoinColumn(name = "city_id")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Column(name = "state",columnDefinition="int default 1")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST},mappedBy = "cinema")
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
