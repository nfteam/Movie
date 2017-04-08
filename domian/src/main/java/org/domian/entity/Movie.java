package org.domian.entity;

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
    private String movId;//id
    private String movName;//名字
    private String englishName;
    private String movDescribe;//描述
    private String movDuration;//时长
    private String movDirector;//导演
    private String movStar;//主演
    private String movPicture;//图片
    private Date addTime;//添加时间
    private String photoList;//图片集
    private Year year;//年份
    private Type type;//类型
    private Edition edition;//版本
    private Region region;//区域
    private int state;//状态
    private Date modifyTime;//修改时间
    private Date releaseTime;  //上映时间
    private Set<Shelves> shelves=new HashSet<>();
//    private Set<Order> orders=new HashSet<>();
    private Set<Comment> comments=new HashSet<>();

    @Id
    @Column(name = "mov_id")
    public String getMovId() {
        return movId;
    }

    public void setMovId(String movId) {
        this.movId = movId;
    }

    @Column(name = "mov_name")
    public String getMovName() {
        return movName;
    }

    public void setMovName(String movName) {
        this.movName = movName;
    }

    @Column(name = "mov_describe")
    public String getMovDescribe() {
        return movDescribe;
    }

    public void setMovDescribe(String movDescribe) {
        this.movDescribe = movDescribe;
    }

    @Column(name = "mov_duration")
    public String getMovDuration() {
        return movDuration;
    }

    public void setMovDuration(String movDuration) {
        this.movDuration = movDuration;
    }

    @Column(name = "mov_director")
    public String getMovDirector() {
        return movDirector;
    }

    public void setMovDirector(String movDirector) {
        this.movDirector = movDirector;
    }

    @Column(name = "mov_star")
    public String getMovStar() {
        return movStar;
    }

    public void setMovStar(String movStar) {
        this.movStar = movStar;
    }


    @Column(name = "mov_photo")
    public String getMovPicture() {
        return movPicture;
    }

    public void setMovPicture(String movPicture) {
        this.movPicture = movPicture;
    }

    @Column(name = "mov_addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "mov_photoList")
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
    @JoinColumn(name = "t_id")
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

    @Column(name = "mov_state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Column(name = "mov_modifyTime")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "movie")
    public Set<Shelves> getShelves() {
        return shelves;
    }

    public void setShelves(Set<Shelves> shelves) {
        this.shelves = shelves;
    }

//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "movie")
//    public Set<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(Set<Order> orders) {
//        this.orders = orders;
//    }


    @Column(name = "EnglishName")
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Column(name="releaseTime")
    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "movie")
    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    @ManyToOne
    @JoinColumn(name = "edition_id")
    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }
}
