package org.domian.entoty;

import javax.persistence.*;

/**
 * Created by LIANG on 2017/2/7.
 * 场次
 */
@Entity
@Table(name="screening_info")
public class Screening {
    private String sId;
    private String Screening;
    private Auditorium auditorium;

    @Id
    @Column(name="s_id")
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    @Column(name="screening")
    public String getScreening() {
        return Screening;
    }

    public void setScreening(String screening) {
        Screening = screening;
    }

    @ManyToOne
    @JoinColumn(name="a_id")
    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }
}
