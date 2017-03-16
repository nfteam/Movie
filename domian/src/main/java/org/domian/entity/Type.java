package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/14.
 * 电影类型
 */
@Entity
@Table(name = "type_info")
public class Type {
    private String typeId;//id
    private String typeName;//类型名称
    private int state;
    private Set<Movie> movies=new HashSet<>();

    @Id
    @Column(name = "type_id")
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

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "type")
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
