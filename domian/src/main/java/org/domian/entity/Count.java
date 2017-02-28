package org.domian.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by LIANG on 2017/2/24.
 */
@Entity
@Table(name = "count_info")
public class Count {
    private String cId;
    private String typeNname;
    private int count;
    private Date time;

    @Id
    @Column(name = "c_id")
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Column(name = "typeName")
    public String getTypeNname() {
        return typeNname;
    }

    public void setTypeNname(String typeNname) {
        this.typeNname = typeNname;
    }

    @Column(name = "time")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Column(name = "count")
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
