package org.domian.entoty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/6.
 * 订单
 */
@Entity
@Table(name="order_info")
public class Order {
    private String oId;
    private String orderId;
    private Film film;
    private Cinema cinemas;
    private Auditorium auditoriums;
    private double price;
    private Date addTime;
    private Date settlementTime;
    private int state;
    private int number;
    private String seat;
    private Users users;

    @Id
    @Column(name="o_Id")
    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    @Column(name="order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @ManyToOne
    @JoinColumn(name="cinemas_id")
    public Cinema getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema cinemas) {
        this.cinemas = cinemas;
    }

    @ManyToOne
    @JoinColumn(name="auditorium_id")
    public Auditorium getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(Auditorium auditoriums) {
        this.auditoriums = auditoriums;
    }

    @Column(name="price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name="addTime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name="settlementTime")
    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    @Column(name="state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Column(name="number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Column(name="seat")
    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @ManyToOne
    @JoinColumn(name="users_id")
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @ManyToOne
    @JoinColumn(name="film_id")
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
