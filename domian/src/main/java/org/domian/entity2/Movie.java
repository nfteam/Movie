package org.domian.entity2;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LIANG on 2017/2/14.
 * 电影
 */
@Entity
@Table(name = "m_info")
public class Movie {
    private String mId;//id
    private String mName;//名字
    private String mDescribe;//描述
    private String mDuration;//时长
    private String mDirector;//导演
    private String mStar;//主演
    private String mPhoto;//图片
    private Date addTime;//添加时间
    private String photoList;//图片集
    private Year year;//年份
    private Type type;//类型
    private Region region;//区域
    private int state;//状态
    private Date modifyTime;//修改时间
    private Set<Shelves> shelves=new HashSet<>();
    private Set<Order> orders=new HashSet<>();
    private Set<Comment> comments=new HashSet<>();

    @Id
    @Column(name = "m_id")
    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    @Column(name = "m_name")
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Column(name = "m_describe")
    public String getmDescribe() {
        return mDescribe;
    }

    public void setmDescribe(String mDescribe) {
        this.mDescribe = mDescribe;
    }

    @Column(name = "m_duriation")
    public String getmDuration() {
        return mDuration;
    }

    public void setmDuration(String mDuration) {
        this.mDuration = mDuration;
    }

    @Column(name = "m_director")
    public String getmDirector() {
        return mDirector;
    }

    public void setmDirector(String mDirector) {
        this.mDirector = mDirector;
    }

    @Column(name = "m_star")
    public String getmStar() {
        return mStar;
    }

    public void setmStar(String mStar) {
        this.mStar = mStar;
    }

    @Column(name = "m_phpto")
    public String getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(String mPhoto) {
        this.mPhoto = mPhoto;
    }

    @Column(name = "m_addtime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "m_photoList")
    public String getPhotoList() {
        return photoList;
    }

    public void setPhotoList(String photoList) {
        this.photoList = photoList;
    }

    @ManyToOne
    @JoinColumn(name = "y_id")
    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @ManyToOne
    @JoinColumn(name = "ty_id")
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @ManyToOne
    @JoinColumn(name = "r_id")
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Column(name = "m_state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Column(name = "m_modifTime")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "movie")
    public Set<Shelves> getShelves() {
        return shelves;
    }

    public void setShelves(Set<Shelves> shelves) {
        this.shelves = shelves;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "movie")
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "movie")
    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
