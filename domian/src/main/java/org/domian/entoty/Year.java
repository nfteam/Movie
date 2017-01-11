package org.domian.entoty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/11.
 */
@Entity
@Table(name="year_info")
public class Year {
    private String Id;
    private String particular;
    private Set<Film> films=new HashSet<>();

    @Id
    @Column(name="year_id")
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Column(name="y_particular")
    public String getParticular() {
        return particular;
    }

    public void setParticular(String particular) {
        this.particular = particular;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "year")
    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
