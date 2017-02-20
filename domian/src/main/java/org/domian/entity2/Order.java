package org.domian.entity2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/14.
 */
@Entity
@Table(name = "o_info")
public class Order {
    private String oId; //id
    private String orderId;//订单编号
    private Auditorium auditorium;//影厅
    private Cinema cinema;//影院
    private Movie movie;//电影
    private Screenings screenings;//场次
    private Users users;//用户
    private Date addTime;//下单时间
    private Date paymentTime;//结算时间
    private int state;//状态
    private double price;//价格
    private int seatNum;//座位数量
    private String saet;//座位号

    @Id
    @Column(name = "o_id")
    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    @Column(name = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @ManyToOne
    @JoinColumn(name = "a_id")
    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @ManyToOne
    @JoinColumn(name = "c_id")
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @ManyToOne
    @JoinColumn(name = "m_id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @ManyToOne
    @JoinColumn(name = "s_id")
    public Screenings getScreenings() {
        return screenings;
    }

    public void setScreenings(Screenings screenings) {
        this.screenings = screenings;
    }

    @ManyToOne
    @JoinColumn(name = "u_id")
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Column(name = "addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "payTime")
    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = "seatNum")
    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    @Column(name = "seat")
    public String getSaet() {
        return saet;
    }

    public void setSaet(String saet) {
        this.saet = saet;
    }
}
