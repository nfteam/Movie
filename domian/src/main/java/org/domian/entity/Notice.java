package org.domian.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by LIANG on 2017/3/30.
 */
@Entity
@Table(name = "notice_info")
public class Notice {
    private String noticeId;
    private String noticeTitle;
    private String noticeValue;
    private String adminName;
    private Date addTime;

    @Id
    @Column(name = "notice_id")
    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    @Column(name = "notice_title")
    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }


    @Column(name = "notice_value")
    public String getNoticeValue() {
        return noticeValue;
    }

    public void setNoticeValue(String noticeValue) {
        this.noticeValue = noticeValue;
    }

    @Column(name = "admin_name")
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Column(name = "add_time")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
