package org.cinema.action;

import org.domian.utils.UUIDUtil;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LIANG on 2017/3/13.
 */
public class UUid {
    public static void main(String[] args) {
        String uuid= UUIDUtil.getUUID();
        System.out.println(uuid);

        String time = "15:30";
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        try {
            System.out.println(Time.valueOf(time));
            Date date = sdf.parse(time);
            System.out.println("Date and Time: " + date);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        String path= "file/dir/go.swf";
//        String file = path.substring(0, "/file".length());
//        System.out.println("file  :" +file);
//        System.out.println("dir   : "+path.substring(path.indexOf("dir/"), path.indexOf("/go.swf")));
//        System.out.println("dir/go.swf   : "+path.substring(path.indexOf("dir/"), path.length()));
    }
}
