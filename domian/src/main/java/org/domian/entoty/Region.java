package org.domian.entoty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/11.
 * 地区
 */
@Entity
@Table(name="region_info")
public class Region {
    private String rId;
    private String region;
    private Set<Film> film=new HashSet<>();

    @Id
    @Column(name="r_id")
    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    @Column(name="region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "region")
    public Set<Film> getFilm() {
        return film;
    }
    public void setFilm(Set<Film> film) {
        this.film = film;
    }
}
