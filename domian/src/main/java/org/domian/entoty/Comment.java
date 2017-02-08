package org.domian.entoty;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/1/12.
 * 回复实体
 */
@Entity
@Table(name="comment_info")
public class Comment {
    private String cId;
    private String values;
    private Date time;
    private Users users;

    @Id
    @Column(name="c_id")
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Column(name="c_value")
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Column(name="c_time")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @ManyToOne
    @JoinColumn(name="users_id")
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
