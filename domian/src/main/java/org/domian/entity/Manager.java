package org.domian.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/20.
 * 影院管理员
 */
@Entity
@Table(name = "manager_info")
public class Manager {
    private String manId;
    private String manName;
    private String password;
    private String manEmail;
    private int state;
    private Cinema cinema;
    private Date loginTime;

    @Id
    @Column(name = "manager_id")
    public String getManId() {
        return manId;
    }

    public void setManId(String manId) {
        this.manId = manId;
    }

    @Column(name = "manager_name")
    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "manager_email")
    public String getManEmail() {
        return manEmail;
    }

    public void setManEmail(String manEmail) {
        this.manEmail = manEmail;
    }

    @Column(name = "state")
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
