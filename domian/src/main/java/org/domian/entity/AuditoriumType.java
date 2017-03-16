package org.domian.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/15.
 * 影厅类型
 */
@Entity
@Table(name = "au_ty_info")
public class AuditoriumType {
    private String typeId;//id
    private String typeName;//类型
    private int state;//状态
    private Set<Auditorium> auditoriums=new HashSet<>();
    private Date addTime;
    private Cinema cinema;



    @Id
    @Column(name = "t_id")
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Column(name = "type_name")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "auditoriumType")
    public Set<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(Set<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    @ManyToOne
    @JoinColumn(name="cinema_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Column(name = "addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "a_state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
