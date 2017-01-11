package org.domian.entoty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/11.
 */
@Entity
@Table(name="type_info")
public class filmType {

    private String tId;
    private String tName;
    private Set<Film> type=new HashSet<>();

    @Id
    @Column(name="t_id")
    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    @Column(name="t_name")
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "type")
    public Set<Film> getType() {
        return type;
    }

    public void setType(Set<Film> type) {
        this.type = type;
    }
}

