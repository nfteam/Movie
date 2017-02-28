package org.domian.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/20.
 * 超级管理员
 */
@Entity
@Table(name = "admin_info")
public class Administrators {
    private String aId;
    private String aName;
    private String apwd;
    private String aEmail;
    private Date loginTime;
    private String ip;
    private int state;

    @Id
    @Column(name = "admin_id")
    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    @Column(name = "admin_name")
    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    @Column(name = "admin_pwd")
    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    @Column(name = "admin_email")
    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    @Column(name = "login_time")
    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Column(name = "admin_ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "admin_state" ,columnDefinition="int default 1")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}