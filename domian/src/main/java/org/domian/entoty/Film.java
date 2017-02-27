package org.domian.entoty;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/11.
 * 电影
 */
@Entity
@Table(name="film_info")
public class Film {
    private String fId;
    private String fName;
    private String fDescribe;
    private Date addTime;
    private String Stage;
    private String Role;
    private String photo;
    private Date longTime;
    private Year year;
    private Region region;
    private filmType type;
    private Set<Order> order=new HashSet<>();

    @Id
    @Column(name="f_id")
    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    @Column(name="f_name")
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Column(name="f_describe")
    public String getfDescribe() {
        return fDescribe;
    }

    public void setfDescribe(String fDescribe) {
        this.fDescribe = fDescribe;
    }

    @Column(name="f_addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name="f_stage")
    public String getStage() {
        return Stage;
    }

    public void setStage(String stage) {
        Stage = stage;
    }

    @Column(name="f_role")
    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Column(name="f_photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Column(name="f_loginTime")
    public Date getLongTime() {
        return longTime;
    }

    public void setLongTime(Date longTime) {
        this.longTime = longTime;
    }

    @ManyToOne
    @JoinColumn(name="yesr_id")
    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @ManyToOne
    @JoinColumn(name="r_id")
    public Region getRegion() {
        return region;
    }
    public void setRegion(Region region) {
        this.region = region;
    }

    @ManyToOne
    @JoinColumn(name="t_id")
    public filmType getType() {
        return type;
    }

    public void setType(filmType type) {
        this.type = type;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "film")
    public Set<Order> getOrder() {
        return order;
    }

    public void setOrder(Set<Order> order) {
        this.order = order;
    }
}
