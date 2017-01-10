package org.domian.entoty;

import javax.persistence.*;

/**
 * Created by LIANG on 2017/1/9.
 */
@Entity
@Table(name="user_info")
public class Users {
    private int id;
    private String name;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="uid")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
