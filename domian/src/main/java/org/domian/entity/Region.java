package org.domian.entity;

import org.domian.entoty.Film;

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
    private String rId;//id
    private String region;//地区
    private Set<Movie> movies=new HashSet<>();

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
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
