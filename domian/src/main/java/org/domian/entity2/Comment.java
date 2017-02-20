package org.domian.entity2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/19.
 * 评论
 */
@Entity
@Table(name = "comment_info")
public class Comment {
    private String cId; //id
    private String cValue;//内容
    private Date cTime;//评论时间
    private Users users;//用户
    private Movie movie;//评论的电影

    @Id
    @Column(name = "c_id")
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Column(name = "c_value")
    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue;
    }

    @Column(name = "c_time")
    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    @ManyToOne
    @JoinColumn(name = "u_id")
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @ManyToOne
    @JoinColumn(name = "m_id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
