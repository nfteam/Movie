package org.domian.entoty;

import javax.persistence.*;

/**
 * Created by LIANG on 2017/1/11.
 */
@Entity
@Table(name="auditorium_info")
public class Auditorium {

    private String aId;
    private String aName;
    private int aNum;
    //多对一关联电影院
    private Cinema cinema;

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
}
