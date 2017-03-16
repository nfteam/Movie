package org.domian.entity;
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

    private String userId;//id
    private String phoneNum;//电话号码
    private String password;//密码
    private Date addTime;//添加时间
    private Set<Order> order=new HashSet<>();
    private Set<Comment> comments=new HashSet<>();

    @Id
    @Column(name="user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name="user_phone")
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Column(name="user_pwd")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "users")
    public Set<Order> getOrder() {
        return order;
    }
    public void setOrder(Set<Order> order) {
        this.order = order;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "users")
    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
