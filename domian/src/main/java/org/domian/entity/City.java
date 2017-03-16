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
    private String cityId;//id
    private String cityName;//城市
    private int state;
    private Set<Cinema> cinema=new HashSet<>();

    @Id
    @Column(name = "city_id")
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Column(name = "city_name")
    public String getCityName() {
        return cityName;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "city")
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

