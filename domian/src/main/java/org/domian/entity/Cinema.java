package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/12.
 * 电影院
 */
@Entity
@Table(name="cin_info")
public class Cinema {
    private String cinId;//id
    private String cinName;//名字
    private String cinPhoto;//图片
    private String cinAddress;//地址
    private String cinTell;//电话
    private String cinEmail;
    private String cinIntroduction;//简介
    private City city; //城市，多对一
    private Manager manager;
    private int state;
    private Set<Auditorium> auditoriums=new HashSet<>();
    private Set<Shelves> shelves=new HashSet<>();
    private Set<Order> orders=new HashSet<>();
    private Set<AuditoriumType> auditoriumTypes=new HashSet<>();

    @Id
    @Column(name="cin_id")
    public String getCinId() {
        return cinId;
    }

    public void setCinId(String cinId) {
        this.cinId = cinId;
    }

    @Column(name = "cin_name")
    public String getCinName() {
        return cinName;
    }

    public void setCinName(String cinName) {
        this.cinName = cinName;
    }

    @Column(name = "cin_photo")
    public String getCinPhoto() {
        return cinPhoto;
    }

    public void setCinPhoto(String cinPhoto) {
        this.cinPhoto = cinPhoto;
    }

    @Column(name = "cin_address")
    public String getCinAddress() {
        return cinAddress;
    }

    public void setCinAddress(String cinAddress) {
        this.cinAddress = cinAddress;
    }

    @Column(name = "cin_tell")
    public String getCinTell() {
        return cinTell;
    }

    public void setCinTell(String cinTell) {
        this.cinTell = cinTell;
    }

    @Column(name = "cin_introduction")
    public String getCinIntroduction() {
        return cinIntroduction;
    }

    public void setCinIntroduction(String cinIntroduction) {
        this.cinIntroduction = cinIntroduction;
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

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cinema")
    public Set<AuditoriumType> getAuditoriumTypes() {
        return auditoriumTypes;
    }

    public void setAuditoriumTypes(Set<AuditoriumType> auditoriumTypes) {
        this.auditoriumTypes = auditoriumTypes;
    }

    @ManyToOne
    @JoinColumn(name = "city_id")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Column(name = "state")
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

    @Column(name = "cin_email")
    public String getCinEmail() {
        return cinEmail;
    }

    public void setCinEmail(String cinEmail) {
        this.cinEmail = cinEmail;
    }
}
