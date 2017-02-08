package org.domian.entoty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/11.
 * 电影院实体
 */
@Entity
@Table(name="cinema_info")
public class Cinema {
    private String cid;
    private String cName;
    private String cPhoto;
    private String cAddress;
    //一对多
    private Set<Auditorium> a_id=new HashSet();
    private Set<Order> order2=new HashSet<>();

    @Id
    @Column(name="c_id")
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Column(name="c_name")
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Column(name="c_photo")
    public String getcPhoto() {
        return cPhoto;
    }

    public void setcPhoto(String cPhoto) {
        this.cPhoto = cPhoto;
    }

    @Column(name="c_address")
    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "cinema")
    public Set<Auditorium> getA_id() {
        return a_id;
    }

    public void setA_id(Set<Auditorium> a_id) {
        this.a_id = a_id;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "cinemas")
    public Set<Order> getOrder2() {
        return order2;
    }

    public void setOrder2(Set<Order> order2) {
        this.order2 = order2;
    }
}
