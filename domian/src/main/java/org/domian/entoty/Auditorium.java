package org.domian.entoty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/11.
 * 影厅实体
 */
@Entity
@Table(name="auditorium_info")
public class Auditorium {

    private String aId;
    private String aName;
    private int aNum;
    //多对一关联电影院
    private Cinema cinema;
    private Set<Order> order3=new HashSet<>();
    private Set<Screening> screenings=new HashSet<>();

    @Id
    @Column(name="a_id")
    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    @Column(name="a_name")
    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    @Column(name="a_num")
    public int getaNum() {
        return aNum;
    }

    public void setaNum(int aNum) {
        this.aNum = aNum;
    }

    @ManyToOne
    @JoinColumn(name="c_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy ="auditoriums" )
    public Set<Order> getOrder3() {
        return order3;
    }

    public void setOrder3(Set<Order> order3) {
        this.order3 = order3;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "auditorium")
    public Set<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(Set<Screening> screenings) {
        this.screenings = screenings;
    }
}
