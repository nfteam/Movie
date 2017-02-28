package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/15.
 * 影厅类型
 */
@Entity
@Table(name = "au_ty_info")
public class AuditoriumType {
    private String tId;//id
    private String tType;//类型
    private int state;//状态
    private Set<Auditorium> auditoriums=new HashSet<>();

    @Id
    @Column(name = "t_id")
    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    @Column(name = "tType")
    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "auditoriumType")
    public Set<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(Set<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    @Column(name = "a_state",columnDefinition="int default 1")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
