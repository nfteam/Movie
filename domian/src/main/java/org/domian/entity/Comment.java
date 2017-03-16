package org.domian.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/19.
 * 评论
 */
@Entity
@Table(name = "comment_info")
public class Comment {
    private String commId; //id
    private String commValue;//内容
    private Date commTime;//评论时间
    private Users users;//用户
    private Movie movie;//评论的电影

    @Id
    @Column(name = "comm_id")
    public String getCommId() {
        return commId;
    }

    public void setCommId(String commId) {
        this.commId = commId;
    }

    @Column(name = "comm_value")
    public String getCommValue() {
        return commValue;
    }

    public void setCommValue(String commValue) {
        this.commValue = commValue;
    }

    @Column(name = "comm_time")
    public Date getCommTime() {
        return commTime;
    }

    public void setCommTime(Date commTime) {
        this.commTime = commTime;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @ManyToOne
    @JoinColumn(name = "movie_id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
