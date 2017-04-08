package org.domian.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/3/31.
 */
@Entity
@Table(name = "edition_info")
public class Edition {
    private String editionId;
    private String editionName;
    private int state;
    private Set<Movie> movie=new HashSet<>();

    @Id
    @Column(name = "edition_id")
    public String getEditionId() {
        return editionId;
    }

    public void setEditionId(String editionId) {
        this.editionId = editionId;
    }

    @Column(name = "edition_name")
    public String getEditionName() {
        return editionName;
    }

    public void setEditionName(String editionName) {
        this.editionName = editionName;
    }

    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "edition")
    public Set<Movie> getMovie() {
        return movie;
    }

    public void setMovie(Set<Movie> movie) {
        this.movie = movie;
    }
}
