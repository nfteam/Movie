package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/14.
 * 电影类型
 */
@Entity
@Table(name = "t_info")
public class Type {
    private String tId;//id
    private String tName;//类型名称
    private int state;
    private Set<Movie> movies=new HashSet<>();

    @Id
    @Column(name = "ty_id")
    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    @Column(name = "t_name")
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "type")
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Column(name = "state",columnDefinition="int default 1")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}