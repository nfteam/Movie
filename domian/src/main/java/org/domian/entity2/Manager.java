package org.domian.entity2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/20.
 */
@Entity
@Table(name = "manager_info")
public class Manager {
    private String mId;
    private String mName;
    private String mPwd;
    private String mEmail;
    private int state;
    private Cinema cinema;
    private Date loginTime;

    @Id
    @Column(name = "manager_id")
    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    @Column(name = "manager_name")
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Column(name = "manager_pwd")
    public String getmPwd() {
        return mPwd;
    }

    public void setmPwd(String mPwd) {
        this.mPwd = mPwd;
    }

    @Column(name = "manager_email")
    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    @Column(name = "state",columnDefinition="int default 1")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

   @OneToOne
   @JoinColumn(name = "c_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
