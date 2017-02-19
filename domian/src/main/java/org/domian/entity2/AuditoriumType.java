package org.domian.entity2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/15.
 */
@Entity
@Table(name = "au_ty_info")
public class AuditoriumType {
    private String tId;
    private String tType;
    private int state;
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

    @Column(name = "a_type",columnDefinition="int default1",nullable=false)
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
