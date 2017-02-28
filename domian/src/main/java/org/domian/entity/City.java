package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/18.
 */
@Entity
@Table(name = "city_info")
public class City {
    private String cId;//id
    private String cName;//城市
    private int state;
    private Set<Cinema> cinema=new HashSet<>();

    @Id
    @Column(name = "c_id")
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
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "city")
    public Set<Cinema> getCinema() {
        return cinema;
    }

    public void setCinema(Set<Cinema> cinema) {
        this.cinema = cinema;
    }

    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

