package org.movieweb.dao;

/**
 * Created by LIANG on 2017/1/10.
 */
public class TestDao {
    //    public static void main(String[] args) {
//        System.out.println( HibernateUtil.getEntityManager());
//    }
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String mytest() {
        System.out.println("---------------");
        msg = "测试";
        return "success";
    }
}
