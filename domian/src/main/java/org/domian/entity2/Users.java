package org.domian.entity2;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/11.
 * 用户
 */
@Entity
@Table(name="user_info")
public class Users {

    private String uId;
    private String phoneNum;
    private String pwd;
    private Date addTime;
    private Set<Order> order=new HashSet<>();
    private Set<Comment> comments=new HashSet<>();

    @Id
    @Column(name="u_id")
    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    @Column(name="u_phone")
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Column(name="u_pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Column(name="addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "users")
    public Set<Order> getOrder() {
        return order;
    }
    public void setOrder(Set<Order> order) {
        this.order = order;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "users")
    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
